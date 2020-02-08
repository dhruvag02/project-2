create database studentdatabase;
show databases;
use studentdatabase;
create table student(Student_id varchar(10),Name1 varchar(20),E_mail varchar(20));
insert into student values("001","ABC","ABC@gmail.com");
insert into student values("002","DEF","DEF@gmail.com");
select *
from student;