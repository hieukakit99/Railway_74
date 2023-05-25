use testingsystem3;
-- question 2
select * from department;
-- quetion 3
select departmentid from department where DepartmentName = 'sale';
-- question 4
select * from account where length(fullname)=(select max(length(fullname)) from account);
-- question 5
with dainhat as (select * from account where DepartmentID=3)
select * from dainhat where length(fullname)=(select max(length(fullname))from dainhat);
-- quesition 6
select GroupName from `group` where CreateDate <'2019-12-20';
-- question 7 không biết làm

-- question 8
select `code` from exam where Duration>=60 and CreateDate<2019-12-20;
-- question 9
select  * from `group` order by CreateDate desc limit 5;
-- quetion 10 
select count(DepartmentID)
from `account` where DepartmentID=2;
-- question 11
select fullname from account where FullName like 'd%o' 
-- quetion 12
delete from exam where CreateDate < '2019-12-20';
-- question 13
delete from question where Content like 'câu hỏi%';
-- question 14
update `account` set fullname = 'Nguyễn Bá Lộc', email = 'loc.nguyenba@vti.com.vn' where `account`=5;
-- question 15
update GroupAccount set accountid=5 where groupid=4
