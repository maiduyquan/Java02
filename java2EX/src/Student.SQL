CREATE DATABASE IF NOT EXISTS Student;

use Student;

DROP TABLE IF EXISTS student;
CREATE TABLE student(
    StudentID int,
    StudentName varchar(50),
    Address varchar(50),
    phone int);

INSERT INTO student VALUES(00,"Unknown God","nun",010101010);