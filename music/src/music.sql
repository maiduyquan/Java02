CREATE DATABASE IF NOT EXISTS music;

USE music;

CREATE TABLE music(
    id int,
    name varchar(50),
    author varchar(50),
    year int);

INSERT INTO music VALUES(1,'Shape Of You','Ed Sheeran',2017);
INSERT INTO music VALUES(2,'Who Am I','Ottiki & Charlotte',2015);
INSERT INTO music VALUES(3,'Hiding In The Blue','The Fat Rat',2021);
INSERT INTO music VALUES(4,'Unstoppable','Sia',2016);