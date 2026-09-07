create table if not exists motorista(
	id serial primary key,
	cnh varchar (11),
	motorista_nome varchar (100),
	data_contratacao varchar (100)
);

create table if not exists onibus(
	id serial primary key,
	placa varchar(100),
	modelo_onibus varchar(100),
	ano_fabricacao varchar(100),
	motorista_onibus int unique,
	constraint fk_motorista_onibus foreign key (motorista_onibus) references motorista(id)
);

create table if not exists viagem(
	id serial primary key,
	origem varchar(100),
	destino varchar(100),
	data_viagem varchar(100),
	horario_viagem varchar (100)
);

create table if not exists passageiro(
	id serial primary key,
	nome_passageiro varchar(100),
	cpf_passageiro varchar(100),
	telefone_passageiro varchar(100)
);

----------------------------------------------------- n por n

create table if not exists realizar_viagem(
	viagem_id int,
	onibus_id int,
	constraint fk_viagem_id foreign key (viagem_id) references viagem(id),
	constraint fk_onibusid foreign key (onibus_id) references onibus(id),
	primary key (viagem_id, onibus_id)
);

create table if not exists passageiro_viagem(
	passageiro_id int,
	viagem_id int,
	constraint fk_passageiro_id foreign key (passageiro_id) references passageiro(id),
	constraint fk_viagem_id2 foreign key (viagem_id) references viagem(id),
	primary key (passageiro_id,viagem_id)
);

----------------------------------------------------- inserts e select


insert into motorista(cnh, motorista_nome,data_contratacao) values
('2456250133','Marcus','29/12/2022');

select * from motorista;

insert into onibus(placa,modelo_onibus,ano_fabricacao,motorista_onibus) values
('HZN4066','Urbano','13/01/2003',1),
('MWZ3896','Micro-Onibus','01/06/2023',2),
('JLD7543','Rodoviário','14/11/2009',3);

select * from onibus;

insert into viagem (origem,destino,data_viagem,horario_viagem) values 
('Pincaba','San Colicio','24/09/2022','15h30'),
('Huánugunas','Aspaca','10/03/2025','19h50'),
('Carmebaé','Jarpana','03/10/2024','10h20');

select * from viagem;

insert into passageiro(nome_passageiro,cpf_passageiro,telefone_passageiro) values
('Maria','15798732002','123456789'),
('Leandro', '01181517036', '9934021943'),
('Luigi','10418013004', '99178322304');

select * from passageiro;

insert into realizar_viagem (viagem_id, onibus_id) values (1,4),(2,6), (3,5);

select viagem.origem, onibus.modelo_onibus
from realizar_viagem
inner join viagem on Viagem.id = realizar_viagem.viagem_id
inner join onibus on Onibus.id = realizar_viagem.onibus_id;

insert into passageiro_viagem (passageiro_id, viagem_id) values (1,3),(2,2),(3,1);

select passageiro.nome_passageiro,viagem.destino
from passageiro_viagem
inner join passageiro on passageiro.id = passageiro_viagem.passageiro_id
inner join viagem on viagem.id = passageiro_viagem.viagem_id;