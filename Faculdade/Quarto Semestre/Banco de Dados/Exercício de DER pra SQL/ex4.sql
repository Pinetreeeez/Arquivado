create table if not exists hospital(
	id serial primary key,
	hospital_cnpj varchar(100),
	hospital_nome varchar(100),
	hospital_endereco varchar(100)
);

create table if not exists departamento(
	id serial primary key,
	depart_especialidade varchar(100),
	hospital_departament int,
	constraint fk_hospitaldepartament foreign key (hospital_departament) references hospital(id)
);

create table if not exists medico(
	id serial primary key,
	med_crm varchar(8),
	med_nome varchar(100),
	med_especialidade varchar(100),
	med_paciente int,
	constraint fk_medpaciente foreign key (med_paciente) references paciente(id)
);

create table if not exists paciente(
	id serial primary key,
	paciente_cpf bigint,
	paciente_nome varchar(100),
	paciente_datanasc varchar(100),
	paciente_conveniomed varchar(100)
);

create table if not exists internacao(
	id serial primary key,
	intern_data_entrada varchar(100),
	intern_diagn_inicial varchar(100),
	intern_med_responsavel varchar (100),
	intern_quarto int,
	intern_paciente int,
	constraint fk_internquarto foreign key (intern_quarto) references quarto(id),
	constraint fk_interpaciente foreign key (intern_paciente) references paciente(id)
);

create table if not exists quarto(
	id serial primary key,
	quarto_quant_leito int,
	quarto_hospital int,
	constraint fk_quartohospital foreign key (quarto_hospital) references hospital(id)
);

----------------------------------------------------- n por n

create table if not exists depart_med(
	depart_id int,
	med_id int,
	constraint fk_depart_id foreign key (depart_id) references departamento(id),
	constraint fk_med_id foreign key (med_id) references medico(id),
	primary key (depart_id, med_id)
);


create table if not exists pacient_quarto(
	paciente_id int,
	quarto_id int,
	constraint fk_paciente_id foreign key (paciente_id) references paciente(id),
	constraint fk_quarto_id foreign key (quarto_id) references quarto(id),
	primary key (paciente_id, quarto_id)
);

----------------------------------------------------- inserts e select

insert into hospital(hospital_cnpj, hospital_nome, hospital_endereco) values 
('12.345.678/0001-95', 'Hospital Santa Cruz', 'Rua das Flores, 123 - Centro'),
('98.765.432/0001-10', 'Hospital São Lucas', 'Av. Brasil, 4500 - Jardim América'),
('45.678.912/0001-33', 'Hospital do Coração', 'Rua Doutor Melo, 88 - Vila Nova');

select * from hospital;

insert into departamento (depart_especialidade, hospital_departament) values
('Cardiologia', 2), ('Pediatria', 3), ('Neurologia Clínica', 1);

select * from departamento;

insert into paciente(paciente_cpf, paciente_nome, paciente_datanasc, paciente_conveniomed) values
(45212378901, 'Maria Silva', '15/05/1985', 'Unimed'),
(78945612302, 'João Santos', '22/10/1992', 'Amil'),
(32165498703, 'Ana Souza', '03/12/1978', 'Bradesco Saúde');

select * from paciente;

insert into medico (med_crm, med_nome, med_especialidade, med_paciente) values
('12345/SP', 'Dr. Carlos Silva', 'Cardiologia',2),
('87654/SP', 'Dra. Ana Souza', 'Pediatria',1),
('55443/PR', 'Dr. Roberto Santos', 'Neurologia Clinica',3);

select * from medico;

insert into internacao(intern_data_entrada, intern_diagn_inicial, intern_med_responsavel, intern_quarto, intern_paciente) values
('10/05/2026', 'Apendicite aguda', 'Dr. Carlos Silva', 2,1),
('12/06/2026', 'Pneumonia bacteriana', 'Dra. Ana Souza', 1,2),
('15/07/2026', 'Fratura de fêmur', 'Dr. Roberto Santos', 3,3);

select * from internacao;

insert into quarto (quarto_quant_leito, quarto_hospital) values (2, 1), (4, 3), (5, 2);

select * from quarto;

insert into depart_med (depart_id, med_id) values (1,1), (2,2),(3,3);

select departamento.depart_especialidade, medico.med_nome
from depart_med
inner join departamento on departamento.id = depart_med.depart_id
inner join medico on medico.id = depart_med.med_id;

insert into pacient_quarto (paciente_id, quarto_id) values (2,1), (3,1), (1,2);

select paciente.paciente_nome, quarto.quarto_hospital
from pacient_quarto
inner join paciente on paciente.id = pacient_quarto.paciente_id
inner join quarto on quarto.id = pacient_quarto.quarto_id;
