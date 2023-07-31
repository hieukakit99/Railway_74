/**
 * 
 */
package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.ManagerUserService;
import com.vti.entity.Employee;
import com.vti.entity.Manager;

;

/**
 * 
 */
public class ManagerUserController {
	private ManagerUserService managerUserService;

	public ManagerUserController() {
		managerUserService = new ManagerUserService();
	}

	public List<Employee> getListUsersByProjectId() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException 
	 {

	
		return managerUserService.getListUsersByProjectId();

	}
		public List<Manager> getListUsersWithRoleManager() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException 
	 {

		return managerUserService.getListUsersWithRoleManager();
	 }
}
