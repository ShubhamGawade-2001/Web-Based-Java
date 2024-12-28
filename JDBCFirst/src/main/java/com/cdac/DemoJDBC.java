package com.cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
			//Class.forName("com.mysql.cj.jdbc.Driver");

			String url="jdbc:mysql://localhost:3306/cdacdb";
			String uname="cdac";
			String query="select * from users";
			String pass="cdac";
			Connection connection = DriverManager.getConnection(url,uname,pass);
			
			Statement st=connection.createStatement();
			
			ResultSet rs=st.executeQuery(query);
//
//			System.out.println(rs.next());
//			
//			System.out.println(rs.getString("userName"));
//			
//			System.out.println("connected");
			
			while(rs.next()) {
				System.out.println("userName = "+rs.getString("userName"));
				System.out.println("Password = "+rs.getString("password"));
				
				
				
				rs.close();
				
				
				
				st.close();
				connection.close();
				
			}
			
			
			
		} catch ( SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
	}
}
