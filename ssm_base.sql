create database ssm_base;
use ssm_base;
create table account(
    id int primary key auto_increment,
    name varchar(20),
    money double
);