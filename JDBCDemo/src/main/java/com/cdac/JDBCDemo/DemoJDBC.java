package com.cdac.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoJDBC {

	public static void main(String[] args) {
		/*
		 * import 
		 * load and register
		 * connection
		 * statement
		 * execute statement
		 * process result
		 * close
		 * */
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.driver");
			String url="jdbc:mysql://localhost:3306/cdacdb";
			String uname="cdac";
			
			String pass="cdac";
			Connection connection = DriverManager.getConnection(url,uname,pass);
	
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
	}
}