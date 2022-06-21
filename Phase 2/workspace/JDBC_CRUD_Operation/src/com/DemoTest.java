package com;
import java.sql.*;
import java.util.Scanner;
public class DemoTest {

	public static void main(String[] args) {
		
		try {
		//Class.forName("com.mysql.jdbc.Driver");	// 5.x
		Class.forName("com.mysql.cj.jdbc.Driver");		// 8.x
		System.out.println("Driver Loaded successfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb","root", "root@123");
		System.out.println("Connected successfully");
		Statement stmt = con.createStatement();
// 		insert query 
//		int res = stmt.executeUpdate("insert into employee values(7,'Seeta',14000)");
//		if(res>0) {
//			System.out.println("Record inserted successfully");
//		}
		
// 		delete query 
//		int res = stmt.executeUpdate("delete from employee where id = 1");
//		if(res>0) {
//				System.out.println("Record deleted successfully");
//		}else {
//				System.out.println("Record not present");
//		}
		
// 		update Query 
//		int res = stmt.executeUpdate("update employee set salary = 45000 where id =2");
//		if(res>0) {
//			System.out.println("Record updated successfully");
//		}else {
//			System.out.println("Record didn't update");
//		}
		
// 		retrieve Query 
//		ResultSet rs = stmt.executeQuery("select * from employee");
//		while(rs.next()) {
//				//System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//			System.out.println("id is "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
//		}
		
		Scanner sc = new Scanner(System.in);
		// insert query using PreparedStatement 
//		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
//		System.out.println("Enter the id");
//		int id = sc.nextInt();
//		pstmt.setInt(1, id);							//1st ? mark 	left to right 
//		System.out.println("Enter the name");
//		String name = sc.next();
//		pstmt.setString(2, name);				// 2nd ? mark 	left to right 
//		System.out.println("Enter the salary");
//		float salary = sc.nextFloat();
//		pstmt.setFloat(3, salary);				// 3rd ? mark 	left to right 
//		
//		int res = pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record inserted successfully");
//		}
		
		// delete query using PreparedStatement 
//		PreparedStatement pstmt = con.prepareStatement("delete from employee where id = ?");
//		System.out.println("Plz enter the id to delete the record");
//		int id = sc.nextInt();
//		pstmt.setInt(1, id);
//		int res = pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record deleted successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
		// update query using PreparedStatement 
//		PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where id = ?");
//		System.out.println("Enter the id");
//		int id = sc.nextInt();
//		pstmt.setInt(2, id);
//		System.out.println("Enter the salary");
//		float salary = sc.nextFloat();
//		pstmt.setFloat(1, salary);
//		int res  = pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record updated successfully");
//		}else {
//			System.out.println("Record didn't update");
//		}
		// Select Query using PreparedStatement 
		//PreparedStatement pstmt = con.prepareStatement("select * from employee");						// without condition 
		PreparedStatement pstmt = con.prepareStatement("select * from employee where salary > ?");		// with condition 
		System.out.println("Plz enter the salary");
		float salary = sc.nextFloat();
		pstmt.setFloat(1, salary);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println("Id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
		}
		rs.close();
		pstmt.close();
		stmt.close();
		con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
