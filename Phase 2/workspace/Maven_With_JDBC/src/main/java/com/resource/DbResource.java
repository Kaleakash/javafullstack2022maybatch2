package com.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {

	private static Connection con;	
	static String driverName ="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/myjavadb";
	static String userName = "root";
	static String password="root@123";
	
	  static {									// this block load only once at begining 
		  try {
			    Class.forName(driverName);
				con = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			System.out.println(e);
		}
	  }
	  
		public static Connection getDbConnection() {
				return con;
		}
}
