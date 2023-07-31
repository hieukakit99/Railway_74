/**
 * 
 */
package com.vti.frondend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.ManagerUserController;
import com.vti.entity.Employee;
import com.vti.entity.Manager;


/**
 * 
 */
public class Program {
public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
	ManagerUserController managerUserCon = new ManagerUserController();
	List<Employee> Employees = managerUserCon.getListUsersByProjectId();
	for (Employee Employee : Employees) {
		System.out.println(Employee);
}
	List<Manager> Managers = managerUserCon.getListUsersWithRoleManager();
	for (Manager Manager : Managers) {
		System.out.println(Manager);	
}
}
}
