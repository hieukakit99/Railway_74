-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử
-- dụng store ở câu 9 để xóa)
-- Sau đó in số lượng record đã remove từ các table liên quan trong khi
-- removing
-- select * from examquestion;
-- select * from exam e
-- where year(e.createdate)<=year(now())-3;
-- delete from  examquestion where year(e.createdate)<=year(now())-3;
-- delimiter $$


-- 11. Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
-- nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được 
-- chuyển về phòng ban default là phòng ban chờ việc
select * from department;
select * from account;
-- b1 giả sử xóa phòng ban sale
delete from department d where DepartmentName = 'sale';
 --  b2 sao chép dưz liệu departmentid của phòng ban sale
 select DepartmentID into s_departmentid from department d where d.DepartmentName = 'sale';
 -- b3 update dữ liệu account
  select DepartmentID into s_departmentid from department d where d.DepartmentName = 'sale';
  update account a set a.Departmentid = '13' where a.DepartmentID = s_departmentid;
select * from department;
select * from account;
drop procedure if exists pro_delete_department;
DELIMITER $$
create procedure pro_delete_department(IN in_departmentname VARCHAR(50))
begin
declare s_DepartmentID int ;
  select DepartmentID into s_departmentid from department d where d.DepartmentName = in_departmentname;
  update account a set a.Departmentid = '13' where a.DepartmentID = s_departmentid;
delete from department d where DepartmentName = in_departmentname;
END$$
DELIMITER ;
Call pro_delete_department ('sale');