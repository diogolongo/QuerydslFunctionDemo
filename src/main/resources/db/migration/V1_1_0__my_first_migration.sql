#create database dbteste;
create schema querydsl;

create table tabela
(
	id int auto_increment,
	campo1 varchar(100) not null,
	campo2 varchar(100) not null,
	campo3 decimal(10,2) not null,
	constraint tabela_pk
		primary key (id),
		fulltext (campo1, campo2)
);

