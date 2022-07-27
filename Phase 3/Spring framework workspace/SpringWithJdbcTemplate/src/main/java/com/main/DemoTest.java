package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee)ac.getBean("employee");
		emp.setId(12);
		emp.setName("Dinesh");
		emp.setSalary(32000);
		EmployeeService es  =(EmployeeService)ac.getBean("employeeService");
		
		// insert operation 
//		String result = es.storeEmployee(emp);
//		System.out.println(result);
		
		// Delete operation 
//		String result = es.deleteEmployeeDetails(100);
//		System.out.println(result);
		
		// update operation 
//		Employee emp1 = (Employee)ac.getBean("employee");
//		emp1.setId(1);
//		emp1.setSalary(22000);
//		String result = es.updateEmployeeDetails(emp1);
//		System.out.println(result);
		
		List<Map<String, Object>> listOfRecods = es.getAllEmployees();
		Iterator<Map<String,Object>> ii  = listOfRecods.iterator();
		while(ii.hasNext()) {
			Map<String, Object> mm = ii.next();
			System.out.println(mm);
		}
	}

}
