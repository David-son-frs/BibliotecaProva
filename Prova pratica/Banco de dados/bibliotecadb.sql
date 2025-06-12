Create database CatalogoDeLivros;
use CatalogoDeLivros;
Create table bibliotecario(
id bigint auto_increment primary key not null,
nome varchar(300)not null,
email varchar(300)not null
);

Create table livros(
idlivro bigint auto_increment primary key not null,
titulo varchar(300)not null,
autor varchar(300)not null,
genero varchar(50)not null,
disponibilidade boolean not null,
datacadastro date not null,
foreign key (idlivro) references bibliotecario (id)
);
