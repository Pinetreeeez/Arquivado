drop table if exists Cinema, Salas, Filme, Sessao, Cliente, Tem_sessao_sala;

create table if not exists Cinema(
	id serial primary key,
	cinema_nome varchar (100),
	cinema_endereco varchar (100)
);

create table if not exists Salas(
	id serial primary key,
	sala_assentos int,
	sala_numero int,
	sala_exibir_filme int,
	constraint fk_salanumero foreign key (sala_numero) references Cinema(id),
	constraint fk_salaexibirfilme foreign key (sala_exibir_filme) references Filme(id)
);

create table if not exists Filme(
	id serial primary key,
	filme_titulo varchar (100),
	filme_genero varchar (100),
	filme_duracao varchar (5)
);

create table if not exists Sessao(
	id serial primary key,
	sessao_regisfilme varchar(100),
	sessao_data varchar(100),
	sessao_horarioinicio varchar(100)
);

create table if not exists Cliente(
	id serial primary key,
	cliente_cpf bigint,
	cliente_nome varchar(100),
	cliente_email varchar(100)
);

----------------------------------------------------- n por n

create table if not exists Tem_sessao_sala(
	sala_id int,
	sessao_id int,
	constraint fk_salaid foreign key (sala_id) references Salas(id),
	constraint fk_sessaoid foreign key (sessao_id) references Sessao(id),
	primary key (sala_id, sessao_id)
);

create table if not exists Ter_cliente_sessao(
	cliente_id int,
	sessao_id int,
	constraint fk_clienteid foreign key (cliente_id) references Cliente(id),
	constraint fk_sessaoid2 foreign key (sessao_id) references Sessao(id),
	primary key (cliente_id, sessao_id)
);

insert into Ter_cliente_sessao (cliente_id, sessao_id) values (1, 2), (2,2);

select Cliente.cliente_cpf, Sessao.sessao_regisfilme
from Ter_cliente_sessao
inner join Cliente on Cliente.id = Ter_cliente_sessao.cliente_id
inner join Sessao on Sessao.id = Ter_cliente_sessao.sessao_id;

----------------------------------------------------- inserts e select

insert into Cinema(cinema_nome,cinema_endereco) values
('Cinema Rio Preto','Shopping Rio Preto'),
('Cinema São Paulo','Mercadão'),
('Cinema Uberlândia','Nas Minas');

select * from Cinema;

insert into Salas(sala_assentos, sala_numero, sala_exibir_filme) values (60,2,1),(90,3,3),(50,1,2);

select * from Salas;

insert into Filme (filme_titulo,filme_genero,filme_duracao) values
('O Poderoso Chefão', 'Drama', '02h55'),
('Interestelar', 'Ficção', '02h49'),
('Vingadores', 'Ação', '02h21');

select * from Filme;

insert into Sessao(sessao_regisfilme,sessao_data,sessao_horarioinicio) values
('Titanique','24/04/2004','19h30'),
('Marioa Movie','09/10/2025','20h');

select * from Sessao;

insert into Cliente(cliente_cpf,cliente_nome,cliente_email) values
(40184901712,'Eliodas','Eliodas@gmail.com'),
(06549802625,'Mariono','Wahoo@gmail.com');

select * from Cliente;

insert into Tem_sessao_sala (sala_id,sessao_id) values(1, 2), (3,1);

select Salas.sala_numero, Sessao.sessao_regisfilme
from Tem_sessao_sala
inner join Salas on Salas.id = Tem_sessao_sala.sala_id
inner join Sessao on Sessao.id = Tem_sessao_sala.sessao_id;


