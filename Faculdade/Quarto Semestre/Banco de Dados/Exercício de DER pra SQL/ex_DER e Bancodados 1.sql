create table if not exists Livro(
	id serial primary key,
	livro_titulo varchar(100),
	livro_isbn varchar (13),
	livro_quant_disponivel int,
	livro_ano_pub varchar (100)
);

create table if not exists Categoria(
	id serial primary key,
	categoria_nome varchar(100),
	categoria_livro int,
	constraint fk_categorialivro foreign key (categoria_livro) references Livro(id)
);

create table if not exists Autores(
	id serial primary key,
	autor_nome varchar(100),
	autor_nacionalidade varchar(100),
	autor_data_nasc varchar(30)
);

create table if not exists Leitores(
	id serial primary key,
	leitor_nome varchar(100),
	leitor_cpf varchar(100),
	leitor_telefone varchar(100),
	leitor_matricula varchar(100),
	leitor_email varchar(100)
);


create table if not exists Emprestimo(
	id serial primary key,
	emprestimo_data varchar (30),
	emprestimo_data_prevista_devolucao varchar(30),
	emprestimo_data_efetiva_devolucao varchar(30),
	emprestimo_livro int,
	emprestimo_leitor int,
	constraint fk_emprestimolivro foreign key (emprestimo_livro) references Livro(id),
	constraint fk_emprestimoleitor foreign key (emprestimo_leitor) references Leitores(id)
);

----------------------------------------------------- n por n

create table if not exists Possui_autor_livro(
	autor_id int,
	livro_id int,
	constraint fk_autorid foreign key (autor_id) references Autores (id),
	constraint fk_livroid foreign key (livro_id) references Livro (id),
	primary key(autor_id, livro_id)
);

----------------------------------------------------- inserts e select

insert into Livro (livro_titulo, livro_isbn, livro_quant_disponivel, livro_ano_pub) values 
('O Senhor dos Anéis', '9788533613409', 5, '1954'),
('Dom Casmurro', '9788575030245', 3, '1899'),
('1984', '9788535914849', 8, '1949'),
('O Guia do Mochileiro das Galáxias', '9788599296578', 12, '1979'),
('Harry Potter e a Pedra Filosofal', '9788532511010', 10, '1997');

select * from Livro;

insert into Categoria (categoria_nome, categoria_livro) values 
('Fantasia', 1),           
('Literatura Clássica', 2),
('Ficção Científica', 3),  
('Ficção Científica', 4),  
('Fantasia', 5);

select * from Categoria;

insert into Autores (autor_nome, autor_nacionalidade, autor_data_nasc) values 
('J.R.R. Tolkien', 'Britânica', '03/01/1892'),
('Machado de Assis', 'Brasileira', '21/06/1839'),
('George Orwell', 'Britânica', '25/06/1903'),
('Douglas Adams', 'Britânica', '11/03/1952'),
('J.K. Rowling', 'Britânica', '31/07/1965');

select * from Autores;

insert into Leitores (leitor_nome, leitor_cpf, leitor_telefone, leitor_matricula, leitor_email) values 
('Ana Silva', '11122233344', '11999998888', 'MAT001', 'ana@email.com'),
('Carlos Sousa', '55566677788', '11988887777', 'MAT002', 'carlos@email.com'),
('Beatriz Lima', '99900011122', '11977776666', 'MAT003', 'beatriz@email.com');

select * from Leitores;

insert into Emprestimo (emprestimo_data, emprestimo_data_prevista_devolucao, emprestimo_data_efetiva_devolucao, emprestimo_livro, emprestimo_leitor) values 
('01/09/2026', '15/09/2026', '14/09/2026', 1, 1), 
('05/09/2026', '19/09/2026', 'Pendente', 3, 2),   
('08/09/2026', '22/09/2026', '20/09/2026', 4, 3), 
('10/09/2026', '24/09/2026', 'Pendente', 2, 1);

select * from Emprestimo;

insert into Possui_autor_livro (autor_id, livro_id) values 
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5);

select Autores.autor_nome, Livro.livro_titulo
from Possui_autor_livro
inner join Autores on Autores.id = Possui_autor_livro.autor_id
inner join Livro on Livro.id = Possui_autor_livro.livro_id;
