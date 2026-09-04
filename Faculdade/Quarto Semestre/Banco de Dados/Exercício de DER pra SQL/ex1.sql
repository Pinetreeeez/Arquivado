create table if not exists autores(
id serial primary key,
nome varchar(100)
);

create table if not exists categoria(
id serial primary key,
descricao varchar(100)
);

create table if not exists livro(
id serial primary key,
titulo_livro varchar(100),
ano_de_publicacao integer,
num_ISBN varchar(13),
livro_autor integer,
catego_livro integer,
constraint fk_livro_autor foreign key(livro_autor) references autores(id),
constraint fk_categolivro foreign key(catego_livro) references categoria(id)
);

create table if not exists livrarias(
id serial primary key,
nome_livraria varchar(100),
cnpj_livraria varchar(14),
endereco_livraria varchar(100)
);

create table if not exists compra(
id serial primary key,
quant_livro integer,
data_compra integer,
constraint fk_quant_livro foreign key(quant_livro) references livro(id),
constraint fk_data_compra foreign key(data_compra) references livrarias(id)
);


insert into autores(nome) values ('Marcos Diogo'), ('Lunário da Silva'),('Mario Santos');
select * from autores;

insert into categoria(descricao) values ('Romance'),('Aventura'),('Terror');
select * from categoria;

truncate table livro;

insert into livro(titulo_livro,ano_de_publicacao,num_ISBN,livro_autor,catego_livro) values 
('Memórias póstumas', 2005,'8126604', 2, 2),
('A lenda do homem zumbi', 2023,'2164740', 1, 3),
('A Odisséia', 2017,'1064469', 3, 1);
select * from livro;

insert into livrarias(nome_livraria,cnpj_livraria,endereco_livraria) values ('Bom Jesus','47621885000100', 'Fafafifi');
truncate table livrarias;
select * from livrarias;

insert into compra(quant_livro,data_compra) values (4,1);
select * from compra;