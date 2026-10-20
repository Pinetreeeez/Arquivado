create table if not exists Usuario(
	usuario_id serial primary key,
	usuario_nome varchar(100) not null,
	usuario_cpf varchar(11) not null,
	usuario_telefone varchar(100) not null,
	usuario_data_nasc date not null,
	usuario_endereco varchar(100) not null,
	usuario_email varchar(100) not null unique
);

create table if not exists Autores(
	autor_id serial primary key,
	autor_nome varchar(100) not null,
	autor_data_nasc date not null,
	autor_nacionalidade varchar(100) not null
);

create table if not exists Editora(
	editora_id serial primary key,
	editora_nome varchar(100) not null,
	editora_CNPJ varchar(14) not null,
	editora_telefone varchar(100) not null,
	editora_cidade varchar(100) not null
);

create table if not exists Obra(
	obra_id serial primary key,
	obra_titulo varchar(100) not null,
	obra_ISBN varchar(13) not null,
	obra_ano_publicacao varchar(100) not null,
	obra_edicao varchar(100) not null,
	obra_num_paginas int not null,
	obra_idioma varchar(100) not null,
	obra_editora int,
	constraint fk_obra_editora foreign key (obra_editora) references Editora(editora_id)
);

create table if not exists Exemplar_Fisico(
	exemplar_id serial primary key,
	exemplar_data_aquisicao date not null,
	exemplar_codigo_identificacao int not null,
	exemplar_estado_de_conservacao varchar(100) not null,
	exemplar_situacao_atual varchar(100) not null,
	exemplar_obra int,
	constraint fk_exemplar_obra foreign key (exemplar_obra) references Obra(obra_id)
);

create table if not exists Emprestimo(
	emprestimo_id serial primary key,
	emprestimo_situacao_de_emprestimo varchar(100) not null,
	emprestimo_data_presvita_devolucao date not null,
	emprestimo_data_real_devolucao date,
	emprestimo_data_de_retirada date not null,
	emprestimo_exemplar int,
	emprestimo_usuario int,
	constraint fk_emprestimo_exemplar foreign key(emprestimo_exemplar) references Exemplar_Fisico(exemplar_id),
	constraint fk_emprestimo_usuario foreign key (emprestimo_usuario) references Usuario(usuario_id)
);


----------------------------------------------------- n por n

create table if not exists escrever_obra(
	autor_codigo int,
	obra_codigo int,
	constraint fk_autor_codigo foreign key (autor_codigo) references Autores(autor_id),
	constraint fk_obra_codigo foreign key (obra_codigo) references Obra(obra_id),
	primary key (autor_codigo, obra_codigo)
);