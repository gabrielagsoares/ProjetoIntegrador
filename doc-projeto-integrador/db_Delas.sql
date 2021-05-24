create database db_delas;
use db_delas;


create table tb_usuarios(
id bigint auto_increment,
nome varchar(255) not null,
genero varchar(255) not null,
data_nasc date not null,
email varchar(255) not null,
senha varchar(255) not null,
usua varchar(255) not null,
telefone varchar(255),
foto_perfil varchar(255),
endereco varchar(255),
url varchar(255),
bio varchar(255),
tipo_usua boolean,
categorias varchar(255),
empreen_id bigint,
unique (categorias),
primary key(id),
foreign key (empreen_id) references tb_usuarios(id)
);

create table tb_temas(
id bigint auto_increment,
vestuario varchar(255),
beleza varchar(255),
alimentos varchar(255),
artesanato varchar(255),
tatuagem varchar(255),
saude_e_bemestar varchar(255),
variedades varchar(255),
estetica varchar(255),
body_piercing varchar(255),
id_temas bigint,
primary key (id),
foreign key (vestuario) references tb_usuarios (categorias),
foreign key (beleza) references tb_usuarios (categorias),
foreign key (alimentos) references tb_usuarios (categorias),
foreign key (artesanato) references tb_usuarios (categorias),
foreign key (tatuagem) references tb_usuarios (categorias),
foreign key (saude_e_bemestar) references tb_usuarios (categorias),
foreign key (variedades) references tb_usuarios (categorias),
foreign key (estetica) references tb_usuarios (categorias),
foreign key (body_piercing) references tb_usuarios (categorias)
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
foreign key (id_categorias) references tb_usuarios(id)
);

select * from tb_usuarios;