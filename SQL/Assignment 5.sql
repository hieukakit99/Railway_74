-- tajo view có chứa danh sách nhân viên thuộc phòng ban sale


create view danhsachnhanviensale
 as
 select d.DepartmentName, a.Username, a.fullname,a. DepartmentID from account a join department d 
on a.DepartmentID= d.DepartmentID and d.Departmentname = 'sale';
select* from danhsachnhanviensale;
-- cau 2 tạo view có chứa thông tin các account tham gia vào nhiều group nhất
select * from account;

select * from groupaccount ;

select AccountID, count(AccountID) as num from groupaccount
group by AccountID; 

 select max(datas.num) from (select count(AccountID) as num from groupaccount) as datas;
 
 select AccountID, count(AccountID) as num from groupaccount
 group by AccountID having count(AccountID) = ( select max(datas.num) from (select count(AccountID) as num from groupaccount group by AccountID) as datas);

select a.* from account a 
join  ( select AccountID, count(AccountID) as num from groupaccount
 group by AccountID having count(AccountID) = ( select max(datas.num) from (select count(AccountID) as num from groupaccount group by AccountID) as datas)) as data2
 on a.AccountID=data2.AccountID;
 
 create view view_thamgianhieugroup
 as select a.* from account a 
join  ( select AccountID, count(AccountID) as num from groupaccount
 group by AccountID having count(AccountID) = ( select max(datas.num) from (select count(AccountID) as num from groupaccount group by AccountID) as datas)) as data2
 on a.AccountID=data2.AccountID;
 select * from view_thamgianhieugroup;
 

-- cau 3 taoj view có những câu hỏi chứa conten quá dài hơn 300
  create view view_contentdai
  as select * from question
where char_length(content)>300;
select * from view_contentdai;
delete from question where char_length(content)>300;
-- câu 4 tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
select * from department;
select * from account;
select * from account a join department d
on a.DepartmentID= d.DepartmentID;
create view cacphong as
select d.DepartmentName, count(a.DepartmentID) AS sonhanvien
from account a
join department d ON d.DepartmentID = a.DepartmentID
group by a.DepartmentID
having count(a.DepartmentID) = (select MAX(num2) AS datten FROM
(select count(a.DepartmentID) AS num2 from account a
group by a.DepartmentID) AS datten2);
select * from cacphong;

-- câu 5 tọa view có chứa tất cả các caauhoir do user họ nguyễn tạo ra
select * from question;
select * from account;

select accountid from account where fullname  like 'Nguyễn%';

select * from question where  CreatorID in (
select accountid from account where fullname  like 'Nguyễn%');

create view view_userhonguyentao as select * from question where  CreatorID in (
select accountid from account where fullname  like 'Nguyễn%');
select * from view_userhonguyentao;


-- tạo bằng cte
-- câu 1 Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
with DSNV_Sale AS(
select d.DepartmentName, a.Username, a.fullname,a. DepartmentID from account a join department d 
on a.DepartmentID= d.DepartmentID and d.Departmentname = 'sale'
)
select * from DSNV_sale;
-- cau 2 tạo view có chứa thông tin các account tham gia vào nhiều group nhất
 with account_thamgianhieunhat as (
 select a.* from account a 
join  ( select AccountID, count(AccountID) as num from groupaccount
 group by AccountID having count(AccountID) = ( select max(datas.num) from (select count(AccountID) as num from groupaccount group by AccountID) as datas)) as data2
 on a.AccountID=data2.AccountID
 )
 select * from account_thamgianhieunhat;
 -- cau 3 tạo view có những câu hỏi chứa conten quá dài hơn 300 
 with content_daihon300 as(
select * from question
where char_length(content)>300)
 select * from content_daihon300;
 -- xoa
  delete from question where  QuestionID in (select questionid from content_daihon300 ) ;
 -- câu 4 tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
 with phongban_nhieunhanviennhat as(
 select d.DepartmentName, count(a.DepartmentID) AS sonhanvien
from account a
join department d ON d.DepartmentID = a.DepartmentID
group by a.DepartmentID
having count(a.DepartmentID) = (select MAX(num2) AS datten FROM
(select count(a.DepartmentID) AS num2 from account a
group by a.DepartmentID) AS datten2))
 select * from phongban_nhieunhanviennhat ;
-- câu 5 tọa view có chứa tất cả các caauhoir do user họ nguyễn tạo ra
with cauhoi_honguyentao as (
select * from question where  CreatorID in (
select accountid from account where fullname  like 'Nguyễn%'))
select * from cauhoi_honguyentao;