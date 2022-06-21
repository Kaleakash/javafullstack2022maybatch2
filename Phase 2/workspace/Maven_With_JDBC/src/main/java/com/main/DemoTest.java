package com.main;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Raghu");
		emp.setSalary(15000);
		String result = es.storeEmployee(emp);
		System.out.println(result);
	}

}
