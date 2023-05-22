create database if not exists Testing_System_Assignment_2;

use Testing_System_Assignment_2;

create table if not exists Department (
  Department_ID int auto_increment,
  Department_Name varchar(100) not null,
  primary key (Department_ID)
);

INSERT INTO Department (Department_Name) VALUES
  ('Sale'),
  ('Marketing'),
  ('HR'),
  ('Finance'),
  ('IT');

create table if not exists Position (
  Position_ID int auto_increment,
  Position_Name varchar(100) not null,
  primary key (Position_ID)
);

insert into Position (Position_Name) Values
  ('Intern'),
  ('Junior staffer'),
  ('Senior staffer'),
  ('Team leader'),
  ('Department specialist');

create table if not exists Account (
  Account_ID int auto_increment,
  Email varchar(50) not null,
  Full_Name varchar(50) not null,
  Department_ID int,
  Position_ID int,
  Create_Date date,
  primary key (Account_ID),
  foreign key (Department_ID) references Department(Department_ID),
  foreign key (Position_ID) references Position (Position_ID)
);

insert into Account (Email, Full_Name, Department_ID, Position_ID, Create_Date) Values
  ('A@gmail.com', 'NguyenVanA', 1, 1, '2023-05-15'),
  ('B@gmail.com', 'NguyenVanB', 2, 2, '2023-05-16'),
  ('C@gmail.com', 'NguyenVanC', 3, 3, '2023-05-17'),
  ('D@gmail.com', 'NguyenVanD', 4, 4, '2023-05-18'),
  ('E@gmail.com', 'NguyenVanE', 5, 5, '2023-05-19');

create table if not exists Groupp (
  Group_ID int auto_increment,
  Group_Name varchar(50) not null,
  Creator_ID int,
  Create_Date date,
  primary key (Group_ID),
  foreign key (Creator_ID) references Account(Account_ID)
);

insert into Groupp (Group_Name, Creator_ID, Create_Date) values
  ('Group 1', 1, '2023-05-15'),
  ('Group 2', 2, '2023-05-16'),
  ('Group 3', 3, '2023-05-17'),
  ('Group 4', 4, '2023-05-18'),
  ('Group 5', 5, '2023-05-19');

create table if not exists GroupAccount (
  Group_ID int,
  Account_ID int,
  Join_Date date,
  foreign key (Group_ID) references Groupp(Group_ID),
  foreign key (Account_ID) references Account(Account_ID)
);

insert into GroupAccount (Group_ID, Account_ID, Join_Date) values
  (1, 1, '2023-05-15'),
  (2, 2, '2023-05-16'),
  (3, 3, '2023-05-17'),
  (4, 4, '2023-05-18'),
  (5, 5, '2023-05-19');

create table if not exists TypeQuestion (
  Type_ID int auto_increment,
  Type_Name varchar(50) not null,
  primary key (Type_ID)
);

insert into TypeQuestion (Type_Name) Values
  ('Essay'),
  ('Multiple-Choice');

create table if not exists CategoryQuestion (
  Category_ID int auto_increment,
  Category_Name varchar(50) not null,
  primary key (Category_ID)
);

insert into CategoryQuestion (Category_Name) values
  ('java'),
  ('net'),
  ('sql'),
  ('postman'),
  ('ruby');

create table if not exists Question (
  Question_ID int auto_increment,
  Content varchar(100) not null,
  Category_ID int,
  Type_ID int,
  Creator_ID int,
  Create_Date date,
  primary key (Question_ID),
  foreign key (Category_ID) references CategoryQuestion(Category_ID),
  foreign key (Type_ID) references TypeQuestion(Type_ID),
  foreign key (Creator_ID) references Account(Account_ID)
);

insert into Question (Content, Category_ID, Type_ID, Creator_ID, Create_Date) values
  ('What is OOP?', 1, 1, 1, '2023-05-15'),
  ('What is the latest version of C#?', 2, 2, 2, '2023-05-16'),
  ('What is a primary key?', 3, 1, 3, '2023-05-17'),
  ('How to send a GET request using Postman?', 4, 2, 4, '2023-05-18'),
  ('What is Ruby on Rails?', 5, 1, 5, '2023-05-19');

create table if not exists Answer (
  Answer_ID int auto_increment,
  Content varchar(100) not null,
  Question_ID int,
  Is_Correct Enum ('dung', 'sai'),
  primary key (Answer_ID),
  foreign key (Question_ID) references Question(Question_ID)
);

insert into Answer (Content, Question_ID) values
  ('Object-Oriented Programming', 1),
  ('C# 9.0', 2),
  ('A unique identifier for a record in a database table', 3),
  ('By selecting the GET method and providing the appropriate URL', 4),
  ('A web application framework written in Ruby', 5);

create table if not exists Exam (
  Exam_ID int auto_increment,
  Code varchar(50) not null,
  title varchar(200) not null,
  Category_ID int not null,
  Duration int,
  Creator_ID int,
  Create_Date date  ,
  primary key (Exam_ID),
  foreign key (Category_ID) references CategoryQuestion(Category_ID),
  foreign key (Creator_ID) references Account(Account_ID)
);

insert into Exam (Code, Title, Category_ID, Duration, Creator_ID, Create_Date) values
  ('EXAM001', 'Java Basics', 1, 60, 1, '2023-05-15'),
  ('EXAM002', '.NET Fundamentals', 2, 45, 2, '2023-05-16'),
  ('EXAM003', 'SQL Queries', 3, 30, 3, '2023-05-17'),
  ('EXAM004', 'Postman Essentials', 4, 45, 4, '2023-05-18'),
  ('EXAM005', 'Ruby Programming', 5, 60, 5, '2023-05-19');

create table if not exists Exam_Question (
  Exam_ID int,
  Question_ID int,
  foreign key (Exam_ID) references Exam (Exam_ID),
  foreign key (Question_ID) references Question (Question_ID)
);

INSERT INTO Exam_Question (Exam_ID, Question_ID) VALUES
  (1, 1),
  (1, 2),
  (2, 3),
  (2, 4),
  (3, 5);
