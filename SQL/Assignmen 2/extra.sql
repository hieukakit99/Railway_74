create database extra;
 use extra;
 
create table if not exists Trainee (
  trainee_id int auto_increment primary key,
  full_name varchar(50) not null,
  birth_day date not null,
  gender enum ('male', 'female', 'unknown'),
  et_iq int check (et_iq between 0 and 20),
  et_gmath int check (et_gmath between 0 and 20),
  et_english int check (et_english between 0 and 50),
  training_class varchar(50),
  evaluation_note text
  
);

alter table trainess add column vti_account varchar(50) not null unique;

create table if not exists datatypes(
id int auto_increment primary key,
name varchar (50),
code char (5),
modified_date datetime default now()
);

create table datatype_2(
id int auto_increment primary key,
name varchar(50) not null,
birth_day date not null,
gender enum('1', '2', 'null'),
is_deleted_flag enum('0','1')

);