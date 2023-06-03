create table filmes(

    id bigint not null auto_increment,
    titulo_filme varchar(100) not null,
    sinopse_filme varchar(500) not null,
    estreia_filme varchar(100) not null,
    filme_cartaz varchar(100) not null,
    duracao_filme varchar(50) not null,
    classificacao_filme varchar(5) not null,
    genero_filme varchar(9) not null,
    sessao_filme varchar(100) not null,
    artista varchar(50) not null,

    primary key(id)

);