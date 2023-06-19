-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó


delimiter $$

create procedure pro_get_all_account_by_departmentname (in in_departmentname varchar(255) )
begin
select * from account a join department d using (departmentid) where DepartmentName = in_departmentname ;
end$$
delimiter ;
call pro_get_all_account_by_departmentname ('sale') ;

-- Question 2: Tạo store để in ra số lượng account trong mỗi group
select g.GroupName, count(ga.GroupID)   from groupaccount ga join `group` g using(groupid)
group by ga.GroupID ; 
delimiter $$
create procedure pro_account_by_group (in in_groupname varchar(255))
begin
select g.GroupName, count(ga.GroupID)   from groupaccount ga join `group` g using(groupid)
where g.groupname= in_groupname ;
end$$
delimiter ;

call pro_account_by_group('Testing System');

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
select tq.TypeName, count(q.TypeID)  from question q join typequestion tq using (typeid)
where month(q.createdate) = month(now()) and year(q.createdate)= year(now())
group by q.typeid;

delimiter $$
create procedure pro_in_typequestionn (in in_typename varchar(50)) 
begin
select tq.TypeName, count(q.TypeID)  from question q join typequestion tq using (typeid)
where month(q.createdate) = month(now()) and year(q.createdate)= year(now()) = in_typename
group by q.typeid;
end$$
delimiter ;
call pro_in_typequestion() ;
-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
select tq.TypeName,q.typeid, count(q.TypeID) from question q join typequestion tq using(typeid)
group by q.TypeID
HAVING count(q.typeid) = (SELECT max(SL) FROM (select count(q.TypeID) as SL from question q
group by q.TypeID) AS SL
);
 
 delimiter $$
 create procedure pro_typeid_tipename_maxquestion ()
 begin
select tq.TypeName,q.typeid, count(q.TypeID) from question q join typequestion tq using(typeid)
group by q.TypeID
HAVING count(q.typeid) = (SELECT max(SL) FROM (select count(q.TypeID) as SL from question q
group by q.TypeID) AS SL
); 
 end$$
  delimiter ;
  call pro_typeid_tipename_maxquestion ();
  -- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
-- không hiểu đề

-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
-- chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
-- chuỗi của người dùng nhập vào

