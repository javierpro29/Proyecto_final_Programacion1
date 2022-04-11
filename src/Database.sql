Create database friedfood;

use friedfood;


create table usuario(
	usuario varchar(30) not null primary key,
    password varchar(20),
    rol int,
    foreign key rol 
    references rol(idronl)
);

Create tabla rol(
	idrol int not null primary key,
    permisos varchar(20),
);

