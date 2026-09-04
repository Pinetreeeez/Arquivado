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
	motorista_onibus int,
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

create table if not exists realizar_viagem(
	destino_viagem int references viagem(id),
	veiculo_onibus int references onibus(id),
	primary key (veiculo_onibus,destino_viagem)
);

create table if not exists passageiro_viagem(
	passageiro_viagem_cpf int references passageiro(id),
	passageiro_viagem_nome int references viagem(id),
	primary key (passageiro_viagem_cpf, passageiro_viagem_nome)
);

insert into motorista(cnh, motorista_nome,data_contratacao) values
('21492350133','Henrique','13/12/2022'), ('16861417118','Leonardo','20/03/2010');
--select * from motorista;

insert into onibus(placa,modelo_onibus,ano_fabricacao,motorista_onibus) values
('HZN4066','Urbano','13/01/2003',1),
('MWZ3896','Micro-Onibus','01/06/2023',2),
('JLD7543','Rodoviário','14/11/2009',3);
--drop table onibus cascade;
--select * from motorista inner join onibus on motorista.id = onibus.id;

insert into viagem (origem,destino,data_viagem,horario_viagem) values 
('Pincaba','San Colicio','24/09/2022','15h30'),
('Huánugunas','Aspaca','10/03/2025','19h50'),
('Carmebaé','Jarpana','03/10/2024','10h20');

--select * from viagem;

insert into passageiro(nome_passageiro,cpf_passageiro,telefone_passageiro) values
('Maria','15798732002','123456789'),
('Leandro', '01181517036', '9934021943'),
('Luigi','10418013004', '99178322304');

--select * from passageiro;

insert into realizar_viagem values(1,2),(2,3),(3,1);

select v.origem, v.destino, o.placa, o.motorista_onibus 
from realizar_viagem
join viagem v on v.id = realizar_viagem.destino_viagem
join onibus o on o.id = realizar_viagem.veiculo_onibus;

insert into passageiro_viagem values(1,3),(2,1),(3,2);

select p.nome_passageiro, p.cpf_passageiro, v.data_viagem, v.destino
from passageiro_viagem
join passageiro p on p.id = passageiro_viagem.passageiro_viagem_cpf
join viagem v on v.id = passageiro_viagem.passageiro_viagem_nome;