drop database if exists mydb0107;
create database mydb0107;
use mydb0107;
create table student(
	sno int auto_increment,
    sname varchar(30) not null,
    skor int,
    smath int,
    seng int,
    primary key(sno)
);