package com.cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCINsert {

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
			
			
			//String query="INSERT INTO `cdacdb`.`users` (`userName`, `password`, `name`, `email`) VALUES ('sandasd', 'hyw', 'whyy', 'why@gmail.com')";
			String query="INSERT INTO users VALUES (?,?,?,?)";
			
			
			String pass="cdac";
			Connection connection = DriverManager.getConnection(url,uname,pass);
			
			Statement st=connection.createStatement();
			
			PreparedStatement pre=connection.prepareStatement(query);
			
			pre.setString(1,"new1");
			pre.setString(2, "test12");
			pre.setString(3,"testnew1");
			pre.setString(4,"test@test.com");
			
			//boolean rs=st.execute(query);
			
			pre.execute();
			
			System.out.println("dasd inste");
				//rs.close();
				st.close();
				connection.close();
								
		}catch(	SQLException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}}
