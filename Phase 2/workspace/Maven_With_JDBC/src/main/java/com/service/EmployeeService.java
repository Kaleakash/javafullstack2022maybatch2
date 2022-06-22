package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {
			EmployeeDao ed = new EmployeeDao();
			
			public String storeEmployee(Employee emp) {
				if(emp.getSalary()<12000) {
					return "Salary must be > 12000";
				}else if(ed.storeEmployee(emp)>0) {
					return "Record inserted successfully";
				}else {
					return "Record didn't insert";
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
					return "Record didn't delete";
				}
			}
			
			public Employee findEmployeeById(int id) {
				return ed.findEmployeeDetailsById(id);
			}
			
			public List<Employee> findListOfEmp() {
				List<Employee> listOfEmp = ed.findAllEmployee();
				Iterator<Employee> ii = listOfEmp.iterator();
				while(ii.hasNext()) {
					Employee emp = ii.next();
					emp.setSalary(emp.getSalary()+500);
				}
				return listOfEmp;
			}
}
