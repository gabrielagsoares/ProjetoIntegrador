create database db_delas;
use db_delas;


create table tb_usuarios(
id bigint auto_increment,
nome varchar(255) not null,
genero varchar(100) not null,
data_nasc date not null,
email varchar(255) not null,
senha varchar(150) not null,
usua varchar(150) not null,
telefone varchar(150),
foto_perfil varchar(255),
endereco text not null,
url varchar(255),
bio text,
tipo_usua boolean,
empreen_id bigint,
primary key(id),
foreign key (empreen_id) references tb_usuarios(id)
);

create table tb_temas(
id bigint auto_increment,
categorias varchar (255),
descricao varchar(255),
qtd_posts int,
primary key(id)
);

create table tb_postagens(
id bigint auto_increment,
foto_post varchar(255),
texto_post text,
curtidas int,
id_usua bigint,
id_categorias bigint,
primary key(id),
foreign key (id_usua) references tb_usuarios(id),
foreign key (id_categorias) references tb_temas(id)
);
