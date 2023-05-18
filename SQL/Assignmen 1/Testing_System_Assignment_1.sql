create database Testing_System_Assignment_1;

use Testing_System_Assignment_1;

create table Department(
Department_ID int,
Department_Name varchar(100)
);

create table  Position (
Position_ID int,
Position_Name varchar(100)
);

create table Account (
Account_ID int,
Email varchar(50),
Full_Name varchar(50),
Department_ID int,
Position_ID int,
Create_Date date
);

create table Groupp (
Group_ID int,
Group_Name varchar(50),
Creator_ID int,
Create_Date date
);

create table GroupAccount(
Group_ID int,
Account_ID int,
Join_Date date
);


create table TypeQuestion(
Type_ID int,
Type_Name varchar(50)
);

create table CategoryQuestion(
Category_ID int,
Category_Name varchar(50)
);


create table Question(
Question_ID int,
Content varchar (100),
category_ID int,
Typy_ID int,
Creator_ID int,
Create_Date date
);


create table Answer (
Answer_ID int,
Content varchar(100),
Question_ID int,
Is_Correct Enum ('dung', 'sai')
);


create table Exam(
Exam_ID int,
Code varchar(50),
title varchar(50),
Category_ID int,
Duration time,
Creator_ID int,
Create_Date date
);

create table Exam_Question(
Exam_ID int,
Question_ID int
);
