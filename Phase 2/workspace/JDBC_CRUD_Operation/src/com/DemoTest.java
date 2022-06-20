package com;
import java.sql.*;
public class DemoTest {

	public static void main(String[] args) {
		
		try {
		//Class.forName("com.mysql.jdbc.Driver");	// 5.x
			Class.forName("com.mysql.cj.jdbc.Driver");		// 8.x
		System.out.println("Driver Loaded successfully");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb","root", "root@123");
	System.out.println("Connected successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
