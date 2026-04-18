create database treina_recife;

create table tb_alunos (
    id int auto_increment primary key,
    nome varchar(50) not null,
    email varchar(150) not null,
    dataNascimento datetime not null

);

insert into treina_recife.tb_alunos ('id', 'nome', 'email', 'data_nascimento')
values (1, "Alexandre de Souza Jr.", "alexandre@treinarecife.com.br", timestamp '1995-07-28');

delete from treina_recife.tb_alunos where id = 1;

drop table treina_recife.tb_alunos;