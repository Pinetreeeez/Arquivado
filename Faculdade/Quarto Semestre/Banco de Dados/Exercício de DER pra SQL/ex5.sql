create table if not exists curso(
	id serial primary key,
	curso_titulo varchar(100),
	curso_descricao varchar(100),
	curso_carga_horaria varchar(100)
);

create table if not exists modulos(
	id serial primary key,
	modulo_aula varchar(100),
	modulo_curso int,
	modulo_aluno int,
	constraint fk_modulo_curso foreign key (modulo_curso) references curso(id),
	constraint fk_modulo_aluno foreign key (modulo_aluno) references alunos(id)
);

create table if not exists aula(
	id serial primary key,
	aula_titulo varchar(100),
	aula_conteudo varchar(100),
	aula_duracao varchar(100),
	aula_modulo int,
	constraint fk_aula_modulo foreign key (aula_modulo) references modulos(id)
);

create table if not exists alunos(
	id serial primary key,
	aluno_cpf varchar(100),
	aluno_nome varchar(100),
	aluno_email varchar(100),
	aluno_data_inscricao varchar(100)
);

create table if not exists matricula(
	id serial primary key,
	matricula_data_inicio varchar(100),
	matricula_progresso_aluno varchar(100),
	matricula_curso int,
	matricula_aluno int unique,
	constraint fk_matricula_curso foreign key (matricula_curso) references curso (id),
	constraint fk_matricula_aluno foreign key (matricula_aluno) references alunos(id)
);

create table if not exists professores(
	id serial primary key,
	professor_cpf varchar (100),
	professor_nome varchar(100),
	professor_titulacao varchar(100)
);


----------------------------------------------------- n por n


create table if not exists ministrar(
	curso_id int,
	professor_id int,
	constraint fk_curso_id foreign key (curso_id) references curso(id),
	constraint fk_professor_id foreign key (professor_id) references professores(id),
	primary key(curso_id,professor_id)
);

insert into ministrar (curso_id, professor_id) values (1, 2), (2,1);

select curso.curso_titulo, professores.professor_nome
from ministrar
inner join curso on curso.id = ministrar.curso_id
inner join professores on professores.id = ministrar.professor_id;


----------------------------------------------------- inserts e select


insert into curso (curso_titulo, curso_descricao, curso_carga_horaria) values
('Desenvolvimento Web Fullstack', 'Curso completo de HTML, CSS, JS e banco de dados', '120 horas'),
('Banco de Dados SQL', 'Aprenda modelagem e manipulação de dados relacionais', '40 horas');

select * from curso;

insert into alunos (aluno_cpf, aluno_nome, aluno_email, aluno_data_inscricao) values
('123.456.789-00', 'Ana Silva', 'ana.silva@email.com', '2024-01-15'),
('234.567.890-11', 'Bruno Oliveira', 'bruno.oliveira@email.com', '2024-02-01'),
('345.678.901-22', 'Carla Souza', 'carla.souza@email.com', '2024-02-10');

select * from alunos;

insert into modulos (modulo_aula, modulo_curso, modulo_aluno) values
('Módulo 01 - Introdução ao Frontend', 1, 1),
('Módulo 02 - Banco de Dados Relacional', 1, 1),
('Módulo 01 - Fundamentos do SQL', 2, 2);

select * from modulos;

insert into aula (aula_titulo, aula_conteudo, aula_duracao, aula_modulo) values
('Estrutura HTML5', 'Aprenda os elementos básicos de uma página web', '45 minutos', 1),
('Estilização com CSS3', 'Conceitos de Grid, Flexbox e cores', '60 minutos', 1),
('Comando CREATE TABLE e INSERT', 'Criando tabelas e inserindo registros', '50 minutos', 2);

select * from aula;

insert into matricula (matricula_data_inicio, matricula_progresso_aluno, matricula_curso, matricula_aluno) values
('2024-01-16', '75%', 1, 1),
('2024-02-02', '30%', 2, 2),
('2024-02-11', '0%', 1, 3);

select * from matricula;

insert into professores (professor_cpf, professor_nome, professor_titulacao) values
('111.222.333-44', 'Dr. Roberto Alves', 'Doutor em Ciência da Computação'),
('555.666.777-88', 'Msc. Juliana Costa', 'Mestre em Engenharia de Software');

select * from professores;