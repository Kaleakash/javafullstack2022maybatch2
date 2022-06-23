package com.service;

import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {
	EmployeeDao ed = new EmployeeDao();
	
	public String storeEmployee(Employee emp) {
		if(emp.getSalary()<12000) {
			return "Salary must be > 12000";
		}else if(ed.storeEmployee(emp)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
	}
	
	public String updateEmployee(Employee emp) {
		if(ed.updateEmployee(emp)>0) {
			return "Record updated successfully";
		}else {
			return "Record didn't update";
		}
	}
	
	public String deleteEmployee(int id) {
		if(ed.deleteEmployee(id)>0) {
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}
	
	public Employee findEmployee(int id) {
		return ed.findEmployeeById(id);
	}
	
	public List<Employee> findAllEmployee() {
		return ed.findAllEmployee();
	}
	
	public List<Employee> findEmployeeWithCondition(float salary){
		return ed.findAllEmployeeWithCondition(salary);
	}
	
}
