package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;
import com.resource.DbResource;

public class EmployeeDao {

	
				public int storeEmployee(Employee emp) {
					try {
//					Class.forName("com.mysql.cj.jdbc.Driver");
//					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb", "root", "root@123");
					Connection con = DbResource.getDbConnection();
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
				
				public int deleteEmployee(int id) {
					try {
//						Class.forName("com.mysql.cj.jdbc.Driver");
//						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb", "root", "root@123");
						Connection con = DbResource.getDbConnection();
						PreparedStatement pstmt = con.prepareStatement("delete from employee where id = ?");
						pstmt.setInt(1, id);
						int res =pstmt.executeUpdate();
						return res;
						} catch (Exception e) {
							System.out.println(e.getMessage());
							return 0;
						}
				}
				
				public int updateEmployee(Employee emp) {
					try {
//						Class.forName("com.mysql.cj.jdbc.Driver");
//						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb", "root", "root@123");
						Connection con = DbResource.getDbConnection();
						PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where id = ?");
						pstmt.setFloat(1, emp.getSalary());
						pstmt.setInt(2, emp.getId());
						int res =pstmt.executeUpdate();
						return res;
						} catch (Exception e) {
							System.out.println(e.getMessage());
							return 0;
						}
				}
				
				public 	Employee	findEmployeeDetailsById(int id) {
					try {
//						Class.forName("com.mysql.cj.jdbc.Driver");
//						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb", "root", "root@123");
						Connection con = DbResource.getDbConnection();
						PreparedStatement pstmt = con.prepareStatement("select * from employee where id = ?");
						pstmt.setInt(1, id);
						ResultSet rs = pstmt.executeQuery();
						if(rs.next()) {
								Employee emp = new Employee();
								emp.setId(rs.getInt(1));
								emp.setName(rs.getString(2));
								emp.setSalary(rs.getFloat(3));
								return emp;
						}
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
						return null;
				}
				
				public 	List<Employee>	findAllEmployee() {
					
					List<Employee> listOfEmp = new ArrayList<Employee>();
					try {
//						Class.forName("com.mysql.cj.jdbc.Driver");
//						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb", "root", "root@123");
						Connection con = DbResource.getDbConnection();
						PreparedStatement pstmt = con.prepareStatement("select * from employee");
						
						ResultSet rs = pstmt.executeQuery();
						while(rs.next()) {									// converting all table records into list. 
								Employee emp = new Employee();
								emp.setId(rs.getInt(1));
								emp.setName(rs.getString(2));
								emp.setSalary(rs.getFloat(3));
								listOfEmp.add(emp);
						}
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
						return listOfEmp;
				}
}
