create table usuario(
	id serial primary key,
	nome varchar(100) not null,
	datanascimento date not null,
	cpf varchar(11) not null,
	email varchar(100) not null unique,
	senha varchar(100) not null,
	salario decimal(15,2) not null
);

--Isso faz com que não possa existir dois usuários cujo email seja igual quando comparados em minúsculas
-- o "create unique index" cria um indice que recusa qualquer insert ou update que repita um valor ja existente.
create unique index ux_usuario_email_minusculo on usuario (lower(email)); 

create table estado(
	id serial primary key,
	nomeEstado varchar(100) not null,
	siglaEstado varchar(02) not null
);

-- Mesma coisa que o index do email só que maiuscula pq é sigla de estado
create unique index ux_estado_sigla_maiuscula on estado (upper(siglaEstado));

insert into usuario (nome, datanascimento, cpf, email, senha, salario)
values ('João José Gomes da Silva', '1990-08-10', '08243060073',
 'joaojosegomes@gmail.com', 'senha123', 5200.00);

insert into estado(nomeEstado, siglaEstado) values ('São Paulo','SP');