package com.mycompany.dbuti;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getDbConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root", "admin");
				
			return con;
		}catch(Exception e) {
			System.out.println("Db Connection Error "+e);
		}
		return null;
	}

}
