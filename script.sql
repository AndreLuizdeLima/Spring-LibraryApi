create table autor(
	id uuid primary key,
	nome varchar(255),
	data_nascimento date,
	nascionalidade varchar(255)
)

create table Livro(
	id uuid primary key,
	isbn varchar(20),
	titulo varchar(150),
	data_publicacao date,
	genero varchar(30),
	preco numeric(18,2),
	id_autor uuid references autor(id)
);