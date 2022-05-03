package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbcconnection {
private static Connection con;
	
	public static Connection getConnection() {
		try {
			if(con==null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Bookstore","root","admin");
				System.out.println("Connection Successful . . .");
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}

}
