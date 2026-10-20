create database escola_altertable;

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

alter table alunos add constraint uk_alunos_email unique (email);

alter table docentes add constraint uk_docentes_email unique (email);

alter table cursos add constraint uk_cursos_nome unique (nome);

-- parte 9

alter table alunos add constraint ck_alunos_idade check (idade >= 0);

alter table cursos add constraint ck_cursos_carga_horaria check (carga_horaria_total >= 0);

alter table matriculas add constraint ck_matriculas_situacao check (situacao in
('ATIVA', 'CANCELADA','CONCLUIDA','TRANCADA'));

alter table docentes add constraint ck_docentes_salario check (salario >= 0);

-- parte 10

alter table alunos drop constraint uk_alunos_email;
alter table alunos add constraint uk_alunos_email unique (email);
alter table alunos drop constraint if exists ck_alunos_idade;

-- parte 11

alter table matriculas rename constraint fk_matricula_aluno to fk_matriculas_alunos;
alter table matriculas rename constraint fk_matricula_curso to fk_matriculas_cursos;

-- parte 12

alter table matriculas drop constraint fk_matriculas_alunos;
alter table matriculas add constraint fk_matriculas_alunos foreign key (aluno_id) references alunos(id)
on delete cascade;

INSERT INTO alunos (id, nome_completo, email, idade)
VALUES (1, 'João Silva', 'joao@email.com', 20);
INSERT INTO cursos (id, nome, carga_horaria_total)
VALUES (1, 'Banco de Dados', 80);
INSERT INTO matriculas (id, aluno_id, curso_id, data_matricula)
VALUES (1, 1, 1, CURRENT_DATE);
DELETE FROM alunos
WHERE id = 1;
SELECT * FROM matriculas;

-- No insert da matricula ocorreu erro pois esta faltando um dos valores obrigatórios na coluna de situacao.

-- parte 13

alter table matriculas drop constraint if exists fk_matriculas_cursos;

alter table matriculas add constraint fk_matriculas_cursos foreign key (curso_id)
references cursos(id) on delete set null;

insert into matriculas (id,aluno_id,curso_id,data_matricula,situacao)
values (1,1,1, current_date, 'ATIVA');

delete from cursos where id = 1;
delete from matriculas where id = 1;

select * from matriculas;
select * from cursos;

-- O curso_id ficou null, por causa que da foreign key fk_matriculas_cursos que faz com que quando esse valor é deletado ele fique null e não afete outras tabelas.

-- parte 14

alter table matriculas drop constraint if exists fk_matriculas_cursos;

alter table matriculas add constraint fk_matriculas_cursos foreign key (curso_id)
references cursos(id) on delete restrict;

delete from cursos where id = 1;

-- O postgreSQL não permitiu a exclusão, por causa que o delete viola o RESTRICT da constraint fk_matriculas_cursos.
-- Deveria excluir os filhos da tabela cursos, como por exemplo a tabela matriculas.

-- parte 15

/*
 No ON DELETE CASCADE ele deleta o alvo e tudo relacionado a ele, no ON DELETE SET NULL quando o valor é deletado ele fica null e não deleta ou afeta outras tabelas filhas.
 No ON DELETE RESTRICT ele impede a deleção de valores de uma tabela que são utilizados em outras tabelas filhas.
 Eu utilizaria o ON DELETE CASCADE para limpar todas as tabelas que dependem umas das outras.
 O ON DELETE SET NULL eu usaria para poder manipular variáveis importantes sem causar problemas no banco de dados.
 Eu utilizaria o ON DELETE RESTRICT em siuações a onde eu quero que certos valores importantes não possam ser modificados de nenhuma maneira.
 */

 -- parte 16

alter table matriculas drop constraint if exists fk_matriculas_cursos;

alter table matriculas add constraint fk_matriculas_cursos foreign key (curso_id)
references cursos(id) on update cascade;

INSERT INTO cursos (id, nome, carga_horaria_total)
VALUES (10, 'Papoi de Dados', 180);

insert into matriculas (id,aluno_id,curso_id,data_matricula,situacao)
values (2,1,10, current_date, 'ATIVA');

UPDATE cursos
SET id = 20
WHERE id = 10;

-- O id daquele curso mudou para 20 e nas tabelas filhas a chave estrangeira foi atualizada para ter o mesmo valor

-- parte 17

CREATE TABLE if not exists categorias (
	id INTEGER not null,
	nome VARCHAR(100)
);
INSERT INTO categorias (nome) VALUES ('Tecnologia');
INSERT INTO categorias (nome) VALUES ('Administração');
SELECT * FROM categorias;

drop table categorias;

alter table categorias alter column id add generated by default as identity;

-- Os valores ids vieram da sequência associada pela "add generated by default as identity" que gera identificadores quando os inserts não informam o valor.

-- parte 18

alter table alunos add column if not exists observacao varchar(200);
/* Ele verifica se a coluna não existe, se ela não existe o código roda e se existir ela roda mas não executa o código. */

alter table alunos drop column if exists observacao;
/* Mesma lógica só que verifica se existe primeiro. */

-- parte 19

select * from alunos;
delete from alunos where id = 1;

alter table alunos add column cidade varchar(100), add column estado char(2), add column cep varchar(9);

alter table alunos alter column cidade type varchar(150), alter column estado set not null,
alter column estado set default 'SP';

-- parte 20

-- ex 51
CREATE TABLE produtos (
	codigo INTEGER,
	nome VARCHAR(40),
	preco VARCHAR(20),
	estoque INTEGER,
	categoria VARCHAR(30)
);

alter table produtos add constraint pk_produtos_codigo primary key (codigo);
alter table produtos alter column preco type numeric (10,2) using preco :: numeric; 
alter table produtos alter column preco set not null;
alter table produtos alter column estoque set not null;
alter table produtos rename column codigo to id;
alter table produtos add column ativo boolean default true;
alter table produtos alter column nome set not null;

-- ex 52
CREATE TABLE departamentos (
	id INTEGER,
	nome VARCHAR(100)
);

CREATE TABLE funcionarios (
	id INTEGER,
	nome VARCHAR(100),
	email VARCHAR(100),
	salario NUMERIC(10,2),
	departamento_id INTEGER
);

alter table departamentos add constraint pk_departamentos_id primary key (id);
alter table funcionarios add constraint pk_funcionairos_id primary key (id);

alter table departamentos alter column nome set not null;
alter table funcionarios alter column nome set not null;

alter table funcionarios add constraint uk_funcionarios_email unique (email);
alter table funcionarios add constraint ck_funcionarios_salario check (salario >= 0); 

alter table funcionarios add constraint fk_funcionarios_departamento foreign key (departamento_id)
references departamentos (id);

alter table funcionarios drop constraint fk_funcionarios_departamento;
alter table funcionarios add constraint fk_funcionarios_departamento foreign key (departamento_id)
references departamentos (id) on delete;
