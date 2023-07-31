/**
 * 
 */
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


import com.vti.backend.datalayer.MangerUser;
import com.vti.entity.Employee;
import com.vti.entity.Manager;




/**
 * 
 */
public class ManagerUserService {
	private MangerUser repository;
	public ManagerUserService()  {
		repository = new MangerUser();
		}
	public List<Employee> getListUsersByProjectId() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException 
 {

	return repository.getListUsersByProjectId(null);

}
	public List<Manager> getListUsersWithRoleManager() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException 
 {

	return repository.getListUsersWithRoleManager();

}
}
