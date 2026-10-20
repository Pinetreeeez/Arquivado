insert into Usuario (usuario_nome, usuario_cpf, usuario_telefone, usuario_data_nasc, usuario_endereco, usuario_email) values
('Ana Beatriz Souza', '12345678901', '(11) 98765-4321', '1995-03-14', 'Rua das Flores, 120, São Paulo - SP', 'ana.souza@email.com'),
('Carlos Eduardo Lima', '23456789012', '(21) 97654-3210', '1988-07-22', 'Av. Atlântica, 450, Rio de Janeiro - RJ', 'carlos.lima@email.com'),
('Mariana Oliveira Costa', '34567890123', '(31) 99876-5432', '2001-11-05', 'Rua da Bahia, 89, Belo Horizonte - MG', 'mariana.costa@email.com'),
('João Pedro Almeida', '45678901234', '(41) 98888-1122', '1992-01-30', 'Rua XV de Novembro, 300, Curitiba - PR', 'joao.almeida@email.com'),
('Fernanda Ribeiro', '56789012345', '(51) 97777-3344', '1999-09-18', 'Av. Borges de Medeiros, 700, Porto Alegre - RS', 'fernanda.ribeiro@email.com'),
('Lucas Martins Pereira', '67890123456', '(61) 96666-5566', '1985-05-09', 'Quadra 204, Bloco C, Brasília - DF', 'lucas.pereira@email.com'),
('Juliana Fernandes', '78901234567', '(71) 95555-7788', '1997-12-25', 'Rua Chile, 55, Salvador - BA', 'juliana.fernandes@email.com'),
('Rafael Gomes Santos', '89012345678', '(81) 94444-9900', '1990-04-17', 'Av. Boa Viagem, 1500, Recife - PE', 'rafael.santos@email.com');

select * from Usuario;

insert into Autores (autor_nome, autor_data_nasc, autor_nacionalidade) values
('Machado de Assis', '1839-06-21', 'Brasileira'),
('Clarice Lispector', '1920-12-10', 'Brasileira'),
('George Orwell', '1903-06-25', 'Britânica'),
('Gabriel García Márquez', '1927-03-06', 'Colombiana'),
('J. K. Rowling', '1965-07-31', 'Britânica'),
('Jorge Amado', '1912-08-10', 'Brasileira'),
('Neil Gaiman', '1960-11-10', 'Britânica'),
('Terry Pratchett', '1948-04-28', 'Britânica');

select * from Autores;

insert into Editora (editora_nome, editora_CNPJ, editora_telefone, editora_cidade) values
('Companhia das Letras', '12345678000190', '(31) 3707-3500', 'São Paulo'),
('Editora Rocco', '23456789000101', '(21) 3525-2000', 'Rio de Janeiro'),
('Editora Record', '34567890000112', '(11) 2585-2000', 'Rio de Janeiro'),
('Editora Intrínseca', '45678901000123', '(21) 3206-7400', 'Rio de Janeiro'),
('Editora Globo', '56789012000134', '(41) 3767-7800', 'São Paulo'),
('Editora Aleph', '67890123000145', '(11) 3743-3202', 'São Paulo');

select * from Editora;

insert into Obra (obra_titulo, obra_ISBN, obra_ano_publicacao, obra_edicao, obra_num_paginas, obra_idioma, obra_editora) values
('Dom Casmurro', '9788535911664', '1899', '1ª', 256, 'Português', 1),
('A Hora da Estrela', '9788532508126', '1977', '2ª', 88, 'Português', 2),
('1984', '9788535914849', '1949', '3ª', 416, 'Português', 1),
('Cem Anos de Solidão', '9788501012456', '1967', '5ª', 448, 'Português', 3),
('Harry Potter e a Pedra Filosofal', '9788532530787', '1997', '1ª', 264, 'Português', 2),
('Gabriela, Cravo e Canela', '9788535923049', '1958', '4ª', 424, 'Português', 3),
('Deuses Americanos', '9788576572602', '2001', '2ª', 592, 'Português', 6),
('Good Omens', '9788580575033', '1990', '1ª', 400, 'Inglês', 4),
('Memórias Póstumas de Brás Cubas', '9788535910667', '1881', '3ª', 272, 'Português', 1),
('O Alienista', '9788508124107', '1882', '2ª', 96, 'Português', 5);

select * from Obra;

insert into Exemplar_Fisico (exemplar_data_aquisicao, exemplar_codigo_identificacao, exemplar_estado_de_conservacao, exemplar_situacao_atual, exemplar_obra) values
('2023-01-10', 1001, 'Ótimo', 'Disponível', 1),
('2023-01-10', 1002, 'Bom', 'Emprestado', 1),
('2023-02-15', 1003, 'Ótimo', 'Disponível', 2),
('2023-03-20', 1004, 'Regular', 'Emprestado', 3),
('2023-03-20', 1005, 'Bom', 'Disponível', 3),
('2023-05-05', 1006, 'Ótimo', 'Disponível', 4),
('2023-06-12', 1007, 'Bom', 'Emprestado', 5),
('2023-06-12', 1008, 'Ótimo', 'Disponível', 5),
('2023-07-30', 1009, 'Regular', 'Disponível', 6),
('2023-08-18', 1010, 'Ótimo', 'Emprestado', 7),
('2023-09-25', 1011, 'Bom', 'Disponível', 8),
('2023-10-02', 1012, 'Ótimo', 'Disponível', 9),
('2024-01-14', 1013, 'Bom', 'Emprestado', 10),
('2024-02-21', 1014, 'Danificado', 'Em manutenção', 4);

select * from Exemplar_Fisico;

insert into Emprestimo (emprestimo_situacao_de_emprestimo, emprestimo_data_presvita_devolucao, emprestimo_data_real_devolucao, emprestimo_data_de_retirada, emprestimo_exemplar, emprestimo_usuario) values
('Devolvido', '2026-08-15', '2026-08-14', '2026-08-01', 1, 1),
('Devolvido', '2026-08-20', '2026-08-25', '2026-08-06', 3, 2),
('Ativo', '2026-10-20', null, '2026-10-06', 2, 3),
('Ativo', '2026-10-25', null, '2026-10-11', 4, 4),
('Atrasado', '2026-09-30', null, '2026-09-16', 7, 5),
('Ativo', '2026-10-22', null, '2026-10-08', 10, 6),
('Devolvido', '2026-09-10', '2026-09-09', '2026-08-27', 6, 7),
('Atrasado', '2026-09-28', null, '2026-09-14', 13, 8),
('Devolvido', '2026-07-30', '2026-07-30', '2026-07-16', 11, 1),
('Devolvido', '2026-09-05', '2026-09-12', '2026-08-22', 12, 3);

select * from Emprestimo;

insert into escrever_obra (autor_codigo, obra_codigo) values
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(7, 8),
(8, 8),
(1, 9),
(1, 10);

select Autores.autor_nome, Obra.obra_titulo
from escrever_obra
inner join Autores on Autores.autor_id = escrever_obra.autor_codigo
inner join Obra on Obra.obra_id = escrever_obra.obra_codigo;


----------------------------------------------------- update e delete

update Exemplar_Fisico
set exemplar_estado_de_conservacao = 'Danificado'
where exemplar_id = 2;

update Emprestimo
set emprestimo_data_real_devolucao = '2026-10-30'
where emprestimo_id = 3;

update Emprestimo
set emprestimo_data_real_devolucao = '2026-10-15'
where emprestimo_id = 8;

delete from Emprestimo
where emprestimo_id = 10;

delete from Exemplar_Fisico
where exemplar_id = 14; 

delete from Exemplar_Fisico
where exemplar_id = 9;