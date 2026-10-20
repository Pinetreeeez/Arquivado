create table if not exists Responsavel(
	responsavelCodigo serial primary key,
	responsavelNome varchar(100),
	responsavelCPF varchar(11),
	responsavelTelefone varchar(100),
	responsavelEndereco varchar(100),
	responsavelEmail varchar(100)
);

create table if not exists Animal(
	animalCodigo serial primary key,
	animalNome varchar(100),
	animalEspecie varchar(100),
	animalRaca varchar(100),
	animalSexo varchar(1),
	animalDatanasc varchar(100),
	animalPeso varchar(100),
	animalCor varchar(100)
);

create table if not exists Veterinario(
	veterinarioCodigo serial primary key,
	veterinarioNome varchar(100),
	veterinarioCPF varchar(11),
	veterinarioCRMV varchar(20),
	veterinarioTelefone varchar(100),
	veterinarioEspecialidade varchar(100)
);

create table if not exists Atendimento(
	atendimentoCodigo serial primary key,
	atendimentoData date not null,
	atendimentoHorario time not null,
	atendimentoDiagnostico varchar(100),
	atendimentoObservacoes varchar(100),
	atendimentoValorconsulta varchar(100),
	atendimentoMotivoConsulta varchar(100),
	atendimentoAnimal int,
	atendimentoVeterinaio int,
	constraint fk_atendimentoAnimal foreign key (atendimentoAnimal) references Animal(animalCodigo),
	constraint fk_atendimentoVeterinaio foreign key (atendimentoVeterinaio) references Veterinario(veterinarioCodigo)
);

create table if not exists Medicamentos(
	medicamentoCodigo serial primary key,
	medicamentoNome varchar(100),
	medicamentoFabricante varchar(100),
	medicamentoDosagem varchar(100),
	medicamentoQuantidade varchar(100),
	medicamentoFrequenciaUso varchar(100),
	medicamentoQuantdeDiasTratamento int
);

----------------------------------------------------- n por n

create table if not exists Possuir_Animal(
	responsavel_id int,
	animal_id int,
	constraint fk_responsavel_id foreign key (responsavel_id) references Responsavel(responsavelCodigo),
	constraint fk_animal_id foreign key (animal_id) references Animal(animalCodigo),
	primary key (responsavel_id, animal_id)
);

create table if not exists Prescrever_Med( --Quais meds os vet podem prescrever
	vet_id int,
	medicamento_id int,
	constraint fk_vet_id foreign key(vet_id) references Veterinario(veterinarioCodigo),
	constraint fk_medicamento_id foreign key(medicamento_id) references Medicamentos(medicamentoCodigo),
	primary key(vet_id, medicamento_id)
);

create table if not exists Fornecer_Med( --Quais meds foram fornecidos em cada consulta
	atendi_id int,
	med_id int,
	constraint fk_atendi_id foreign key (atendi_id) references Atendimento(atendimentoCodigo),
	constraint fk_med_id foreign key (med_id) references Medicamentos(medicamentoCodigo),
	primary key (atendi_id, med_id)
);
