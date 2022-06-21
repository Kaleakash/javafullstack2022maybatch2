package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.bean.Employee;

public class EmployeeDao {

	
				public int storeEmployee(Employee emp) {
					try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb", "root", "root@123");
					PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
					pstmt.setInt(1, emp.getId());
					pstmt.setString(2,emp.getName());
					pstmt.setFloat(3, emp.getSalary());
					int res = pstmt.executeUpdate();
					return res;
					} catch (Exception e) {
						System.out.println(e.getMessage());
						//System.out.println(e);			// name of the exception with message 
						//e.printStackTrace();				// name of the exception with message with line also 
						return 0;
					}
					
				}
}
