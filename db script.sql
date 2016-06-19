/*
create database db_userLogin;
*/
use db_userLogin;
/*
create table users(
	user varchar(20) primary key,.
    password varchar(20)
);

create table data(
	user varchar(20) ,
    name varchar(20) not null,
    lastName varchar(20) not null,
	foreign key (user) references users(user)
);
*/

insert into users values("pablonm", "1234");

insert into data values("pablonm", "pablo", "marino");


