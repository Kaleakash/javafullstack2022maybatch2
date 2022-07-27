package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	Employee emp = (Employee)ac.getBean("employee");
	emp.setId(11);
	emp.setName("Lokesh");
	emp.setSalary(24000);
	
	EmployeeService es = (EmployeeService)ac.getBean("employeeService");
	
//	String result = es.storeEmployeeDetails(emp);
//	System.out.println(result);
	
	List<Employee> listOfEmp = es.getAllEmployees();
	for(Employee e : listOfEmp) {
		System.out.println(e);
	}
	}

}
