package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public String storeEmployee(Employee emp) {
		if(employeeDao.storeEmployee(emp)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
	}
	
	public String deleteEmployeeDetails(int id) {
		if(employeeDao.deleteEmployeeInfo(id)>0) {
			return "Record deleted successfully";
		}else {
			return "Record didn't delete";
		}
	}
	
	public String updateEmployeeDetails(Employee emp) {
		if(employeeDao.updateEmployeeInfo(emp)>0) {
			return "Employee record updated successfully";
		}else {
			return "Employee record didn't update";
		}
	}
	
	public List<Map<String, Object>> getAllEmployees() {
		return employeeDao.getAllEmployee();
	}
}
