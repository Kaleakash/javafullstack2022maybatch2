package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository      // this annotation dao layer specific annotation 
public class EmployeeDao {

	@Autowired
	DataSource ds;					// pull the db connection from beans.xml 
	
	public int storeEmployee(Employee emp) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setFloat(3, emp.getSalary());
			int res  = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
	
	public List<Employee> getAllEmployees() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getFloat(3));
				listOfEmp.add(emp);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return listOfEmp;
	}
	
}
