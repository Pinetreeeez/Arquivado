insert into Responsavel (responsavelNome, responsavelCPF, responsavelTelefone, responsavelEndereco, responsavelEmail) 
values 
('João da Silva', '11122233344', '(11) 98765-4321', 'Rua das Flores, 123 - Centro', 'joao.silva@email.com'),
('Maria Oliveira', '22233344455', '(21) 99988-7766', 'Av. Brasil, 456 - Jd. Primavera', 'maria.oliveira@email.com'),
('Carlos Santos', '33344455566', '(31) 91234-5678', 'Praça da Matriz, 78 - Bairro Alto', 'carlos.santos@email.com');

select * from Responsavel;

insert into Animal (animalNome, animalEspecie, animalRaca, animalSexo, animalDatanasc, animalPeso, animalCor) 
values 
('Rex', 'Cachorro', 'Labrador', 'M', '10/05/2018', '30 kg', 'Amarelo'),
('Mimi', 'Gato', 'Siamês', 'F', '15/08/2020', '4.5 kg', 'Branco com manchas cinzas'),
('Bolinha', 'Cachorro', 'Poodle', 'M', '01/12/2019', '8 kg', 'Branco'),
('Thor', 'Gato', 'Persa', 'M', '20/01/2021', '5 kg', 'Laranja');

select * from Animal;

insert into Veterinario (veterinarioNome, veterinarioCPF, veterinarioCRMV, veterinarioTelefone, veterinarioEspecialidade) 
values 
('Dra. Ana Costa', '44455566677', 'CRMV-SP 12345', '(11) 97777-6655', 'Clínica Geral'),
('Dr. Pedro Lima', '55566677788', 'CRMV-RJ 54321', '(21) 96666-5544', 'Ortopedia'),
('Dra. Julia Souza', '66677788899', 'CRMV-MG 98765', '(31) 95555-4433', 'Dermatologia');

select * from Veterinario;

insert into Atendimento (atendimentoData, atendimentoHorario, atendimentoDiagnostico, atendimentoObservacoes, atendimentoValorconsulta, atendimentoMotivoConsulta, atendimentoAnimal, atendimentoVeterinaio) 
values 
('2023-10-01', '10:00:00', 'Otite Canina', 'Limpar orelha 2x ao dia', 'R$ 150,00', 'Coceira intensa na orelha', 1, 1),
('2023-10-02', '14:30:00', 'Fratura na pata', 'Raio-x realizado, tala aplicada', 'R$ 350,00', 'Queda do muro', 2, 2),
('2023-10-03', '09:15:00', 'Dermatite Alérgica', 'Evitar contato com grama', 'R$ 180,00', 'Queda de pelo e vermelhidão', 3, 3),
('2023-10-05', '16:00:00', 'Check-up Anual', 'Animal saudável, vacinas em dia', 'R$ 120,00', 'Rotina', 4, 1);

select * from Atendimento;

insert into Medicamentos (medicamentoNome, medicamentoFabricante, medicamentoDosagem, medicamentoQuantidade, medicamentoFrequenciaUso, medicamentoQuantdeDiasTratamento) 
values
('Antibiótico VetPlus', 'FarmaBicho', '50mg', '1 comprimido', 'De 12 em 12 horas', 7),
('Anti-inflamatório Max', 'SaúdePet', '10mg', 'Metade do comprimido', 'De 24 em 24 horas', 5),
('Pomada DermeClean', 'PeleSã Vet', '20g', '1 aplicação local', 'De 12 em 12 horas', 10),
('Analgésico Conforto', 'FarmaBicho', '5mg', '1 comprimido', 'De 8 em 8 horas', 3);

select * from Medicamentos;

insert into Possuir_Animal (responsavel_id, animal_id) values (1, 1), (2, 2), (2, 4), (3, 3);

select Responsavel.responsavelNome, Animal.animalNome
from Possuir_Animal
inner join Responsavel on Responsavel.responsavelCodigo = Possuir_Animal.responsavel_id
inner join Animal on Animal.animalCodigo = Possuir_Animal.animal_id;

insert into Prescrever_Med (vet_id, medicamento_id) values (1, 1), (1, 4), (2, 2), (2, 4), (3, 3), (3, 1); 

select Veterinario.veterinarioNome, Medicamentos.medicamentoNome
from Prescrever_Med
inner join Veterinario on Veterinario.veterinarioCodigo = Prescrever_Med.vet_id
inner join Medicamentos on Medicamentos.medicamentoCodigo = Prescrever_Med.medicamento_id;

insert into Fornecer_Med (atendi_id, med_id) values (1, 1), (1, 4), (2, 2), (2, 4), (3, 3);

select Atendimento.atendimentoMotivoConsulta, Medicamentos.medicamentoNome
from Fornecer_Med
inner join Atendimento on Atendimento.atendimentoCodigo = Fornecer_Med.atendi_id
inner join Medicamentos on Medicamentos.medicamentoCodigo = Fornecer_Med.med_id;

----------------------------------------------------- update e delete

update Animal
set animalPeso = '32 kg' --engordou
where animalCodigo = 1;
select * from Animal;

update Medicamentos
set medicamentoQuantidade = '3 comprimido' --Aumentou a dose
where medicamentoCodigo = 1;
select * from Medicamentos;

update Atendimento
set atendimentoData = '2023-10-06'  --Adiou
where atendimentoCodigo = 2;
select * from Atendimento;

delete from Fornecer_Med
where atendi_id = 1 and med_id = 4; --Não utiliza mais o medicamento

delete from Prescrever_Med
where vet_id = 2 and medicamento_id = 2; --Trocou de tipo de remédio que da

delete from Possuir_Animal
where responsavel_id = 3 and animal_id = 3; -- Frequentão outra veterinaria agora