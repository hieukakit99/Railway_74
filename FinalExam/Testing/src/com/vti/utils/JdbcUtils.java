/**
 * 
 */
package com.vti.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 
 */
public class JdbcUtils {

		private Connection connection;

		public Connection getConnection() throws FileNotFoundException, IOException, SQLException {	
			String urername = "root";
			String password = "root";
			String urlConnection = "jdbc:mysql://localhost:3306/testing";
			String driver = "com.mysql.cj.jdbc.Driver";
			connection = DriverManager.getConnection(urlConnection, urername, password);
			System.out.println("connection success !");
			return connection;
		}

		public void disConnection() throws SQLException {
			connection.close();
		}
		

}


