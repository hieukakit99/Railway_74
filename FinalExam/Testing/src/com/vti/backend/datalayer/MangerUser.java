/**
 * 
 */
package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.utils.JdbcUtils;

/**
 * 
 */
public class MangerUser {
	private JdbcUtils jdbcUtils;
	public MangerUser () {
		jdbcUtils = new JdbcUtils();
	}
	public List<Employee> getListUsersByProjectId(Integer project_id) throws FileNotFoundException, IOException, SQLException {
		List<Employee> users = new ArrayList<>();
		String sql = "SELECT * FROM `user` where project_id = " + project_id + "and role = 'Employee'";
		Connection connection = jdbcUtils.getConnection();
		Statement statement = connection.createStatement();
		 ResultSet result = statement.executeQuery(sql);
		 while (result.next()) {
				User user = new Manager(
						result.getInt("id"),
						result.getString("email"),
						result.getString("full_name")
						);
				users.add((Employee) user);
			}
		return users;
	}
	
	public List<Manager> getListUsersWithRoleManager() throws FileNotFoundException, IOException, SQLException {
		List<Manager> users = new ArrayList<>();
		String sql = "SELECT * FROM `user` where role = 'Manager'";
		Connection connection = jdbcUtils.getConnection();
		Statement statement = connection.createStatement();
		 ResultSet result = statement.executeQuery(sql);
		 while (result.next()) {
				User user = new Manager(
						result.getInt("id"),
						result.getString("email"),
						result.getString("full_name")
						);
				users.add((Manager) user);
			}
		return users;
	}
	
}
