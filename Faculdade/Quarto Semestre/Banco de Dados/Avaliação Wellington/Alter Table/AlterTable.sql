CREATE TABLE alunos (
	id INTEGER,
	nome VARCHAR(80),
	email VARCHAR(100),
	idade VARCHAR(3)
);

CREATE TABLE cursos (
	id INTEGER,
	nome VARCHAR(80),
	carga_horaria INTEGER
);

CREATE TABLE matriculas (
	id INTEGER,
	aluno_id INTEGER,
	curso_id INTEGER,
	data_matricula DATE
);

CREATE TABLE professores (
	id INTEGER,
	nome VARCHAR(100),
	email VARCHAR(100)
);

-- parte 1
alter table alunos add column telefone varchar(20);
alter table alunos add column data_nascimento date;

alter table cursos add column ativo boolean default true;

alter table professores add column salario numeric(10,2);

alter table matriculas add column situacao varchar(20) default 'ATIVA';

-- parte 2
alter table alunos rename column nome to nome_completo;

alter table cursos rename column carga_horaria to carga_horaria_total;

alter table professores rename to docentes;

alter table docentes rename column nome to nome_completo;

-- parte 3

alter table alunos alter column idade type integer using idade :: integer;
alter table alunos alter column nome_completo type varchar(150);

alter table cursos alter column nome type varchar(150);

alter table docentes alter column salario type numeric(10,2);

-- parte 4

alter table alunos alter column nome_completo set not null;

alter table cursos alter column nome set not null;

alter table matriculas alter column data_matricula set not null;

alter table alunos alter column telefone drop not null;

-- parte 5

alter table cursos alter column ativo set default true;

alter table matriculas alter column situacao set default 'ATIVA';

alter table matriculas alter column situacao drop default;

alter table matriculas alter column situacao set default 'PENDENTE';

-- parte 6

alter table alunos add constraint pk_alunos primary key (id);

alter table cursos add constraint pk_cursos primary key (id);

alter table matriculas add constraint pk_matriculas primary key (id);

alter table docentes add constraint pk_docentes primary key (id);

-- parte 7

alter table matriculas add constraint fk_matricula_aluno foreign key (aluno_id) references alunos(id);

alter table matriculas add constraint fk_matricula_curso foreign key (curso_id) references cursos(id);

-- parte 8

