create table if not exists Paciente(
	id serial primary key,
	paciente_nome varchar(100),
	paciente_cpf varchar(100),
	paciente_telefone varchar(100),
	paciente_email varchar(100),
	paciente_endereco varchar(100),
	paciente_data_nasc varchar(100)
);

create table if not exists Especialidade(
	id serial primary key,
	especialidade_nome varchar(100)
);

create table if not exists Medico(
	id serial primary key,
	medico_nome varchar(100),
	medico_telefone varchar(100),
	medico_email varchar(100),
	medico_crm varchar(100),
	medico_especialidade int,
	constraint fk_medicoespecialidade foreign key (medico_especialidade) references Especialidade(id)
);

create table if not exists Consultas(
	id serial primary key,
	consulta_data varchar(100),
	consulta_horario varchar(100),
	consulta_motivo varchar(100),
	consulta_observacoes varchar(100),
	consulta_situacao varchar(100),
	consulta_paciente int,
	consulta_medico int,
	constraint fk_consultapaciente foreign key (consulta_paciente) references Paciente (id),
	constraint fk_consultamedico foreign key (consulta_medico) references Medico (id)
);

create table if not exists Receitas(
	id serial primary key,
	receita_data_emissao varchar(100),
	receita_observacoes varchar(100),
	receita_med_emitiu int,
	constraint fk_receitamedemitiu foreign key (receita_med_emitiu) references Medico(id)
);

create table if not exists Medicamentos(
	id serial primary key,
	medicamento_instrucao_uso varchar(100),
	medicamento_dosagem varchar(100)
);

----------------------------------------------------- n por n

create table if not exists Receita_medicamento(
	receita_id int,
	medicamento_id int,
	constraint fk_receitaid foreign key (receita_id) references Receitas(id),
	constraint fk_medicamentoid foreign key (medicamento_id) references Medicamentos(id)
);

----------------------------------------------------- inserts e select

insert into Paciente (paciente_nome, paciente_cpf, paciente_telefone, paciente_email, paciente_endereco, paciente_data_nasc) values
('Ana Silva', '111.222.333-44', '(11) 98765-4321', 'ana.silva@email.com', 'Rua das Flores, 123 - São Paulo/SP', '15/03/1985'),
('Carlos Eduardo', '222.333.444-55', '(21) 97654-3210', 'carlos.edu@email.com', 'Av. Brasil, 456 - Rio de Janeiro/RJ', '22/07/1990'),
('Juliana Oliveira', '333.444.555-66', '(31) 96543-2109', 'juliana.o@email.com', 'Rua Minas, 789 - Belo Horizonte/MG', '10/11/1978'),
('Roberto Santos', '444.555.666-77', '(41) 95432-1098', 'roberto.s@email.com', 'Av. Paraná, 101 - Curitiba/PR', '05/01/2000'),
('Fernanda Lima', '555.666.777-88', '(51) 94321-0987', 'fernanda.l@email.com', 'Rua Sul, 202 - Porto Alegre/RS', '30/09/1995');

select * from Paciente;

insert into Especialidade (especialidade_nome) values
('Cardiologia'),
('Dermatologia'),
('Pediatria'),
('Ortopedia'),
('Neurologia');

select * from Especialidade;

insert into Medico (medico_nome, medico_telefone, medico_email, medico_crm, medico_especialidade) values
('Dr. Roberto Rocha', '(11) 91111-2222', 'roberto.rocha@hospital.com', 'CRM/SP 123456', 1),
('Dra. Beatriz Costa', '(11) 92222-3333', 'beatriz.costa@hospital.com', 'CRM/SP 234567', 2),
('Dr. Marcos Paulo', '(21) 93333-4444', 'marcos.paulo@hospital.com', 'CRM/RJ 345678', 3),
('Dra. Vanessa Alves', '(31) 94444-5555', 'vanessa.alves@hospital.com', 'CRM/MG 456789', 4),
('Dr. Gabriel Mendes', '(41) 95555-6666', 'gabriel.mendes@hospital.com', 'CRM/PR 567890', 5);

select * from Medico;

insert into Consultas (consulta_data, consulta_horario, consulta_motivo, consulta_observacoes, consulta_situacao, consulta_paciente, consulta_medico) values
('10/05/2026', '09:00', 'Check-up de rotina', 'Paciente relata dores leves no peito', 'Realizada', 1, 1),
('11/05/2026', '10:30', 'Alergia na pele', 'Aparecimento de manchas vermelhas nos braços', 'Realizada', 2, 2),
('12/05/2026', '14:00', 'Consulta pediátrica', 'Acompanhamento do crescimento e vacinação', 'Realizada', 3, 3),
('15/05/2026', '16:00', 'Dor no joelho', 'Suspeita de lesão ligamentar durante corrida', 'Agendada', 4, 4),
('20/05/2026', '11:00', 'Enxaqueca frequente', 'Avaliação neurológica inicial', 'Cancelada', 5, 5);

select * from Consultas;

insert into Receitas (receita_data_emissao, receita_observacoes, receita_med_emitiu) values
('10/05/2026', 'Tomar os medicamentos rigorosamente nos horários indicados', 1),
('11/05/2026', 'Evitar exposição direta ao sol durante o tratamento', 2),
('12/05/2026', 'Manter repouso e hidratação constante', 3),
('15/05/2026', 'Aplicar compressas de gelo no local afetado', 4);

select * from Receitas;

insert into Medicamentos (medicamento_instrucao_uso, medicamento_dosagem) values
('Tomar 1 comprimido via oral a cada 8 horas com bastante água', '500 mg'),
('Aplicar camada fina na área afetada 2 vezes ao dia', 'Pomada 30g'),
('Tomar 10 ml de 12 em 12 horas após as refeições', 'Xarope 120ml'),
('Tomar 1 comprimido uma vez ao dia pela manhã', '50 mg'),
('Diluir 20 gotas em meio copo d’água a cada 6 horas', 'Gotas 20ml');

select * from Medicamentos;

insert into Receita_medicamento (receita_id, medicamento_id) values
(1, 1),(1, 4),(2, 2),(3, 3),(3, 5),(4, 1);

select Receitas.receita_data_emissao, Medicamentos.medicamento_instrucao_uso
from Receita_medicamento
inner join Receitas on Receitas.id = Receita_medicamento.receita_id
inner join Medicamentos on Medicamentos.id = Receita_medicamento.medicamento_id;
