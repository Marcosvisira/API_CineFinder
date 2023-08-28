create table cinemas_filmes(


         id bigint not null auto_increment,
         id_cinema bigint not null,
         id_filme bigint not null,

         primary key(id),
         foreign key(id_cinema) references cinemas(id),
         foreign key(id_filme) references filmes(id)
);