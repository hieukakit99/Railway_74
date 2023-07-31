CREATE DATABASE IF NOT EXISTS testing;
USE testing;

CREATE TABLE IF NOT EXISTS `User` ( 	
	id 				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	full_name	 	CHAR(50) NOT NULL UNIQUE CHECK (LENGTH(`full_name`) >= 6 AND LENGTH(`full_name`) <= 50),
	email 		CHAR(50) NOT NULL UNIQUE CHECK (LENGTH(`email`) >= 6 AND LENGTH(`email`) <= 50),
	`password`		VARCHAR(800) NOT NULL,
    exp_in_year   int,
     pro_skill varchar(50),
     project_id int,
    `role` 			ENUM( 'Employee','Manager') NOT NULL 
);
USE testing;
select * from `User`;
INSERT INTO `User` (full_name, email, `password`, exp_in_year, pro_skill,project_id, `role`)
-- password: password
VALUE			('Nguyen Thanh Hung',	'hung122112@gmail.com',		'$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 4,	'dev', 123456,'Employee'), 
				('Can Tuan Anh',		'cananh.tuan12@vti.com',		'$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu',		1,	'Test',	123456,'Employee'), 
				('Can Tuan Anh 1',		'cananh.tuan123@vti.com',		'$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu',		5,	'Java',	123456,'Manager'), 
                ('Can Tuan Anh 2',		'cananh.tuan1234@vti.com',		'$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu',		7,	'sql',	123456,'Manager')
                


