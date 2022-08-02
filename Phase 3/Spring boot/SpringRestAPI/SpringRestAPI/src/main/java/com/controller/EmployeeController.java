package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
public class EmployeeController {

	// http://localhost:8080/empDetails 
	
	@RequestMapping(value = "empDetails",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeDetails() {
		Employee emp = new Employee(100, "Ramesh", 12000);
		return emp;
	}
	
	@RequestMapping(value = "employees",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployees() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(1, "Ajay", 12000));
		listOfEmp.add(new Employee(2, "Vijay", 15000));
		listOfEmp.add(new Employee(3, "Lokesh", 18000));
		return listOfEmp;
	}
	
	// http://localhost:8080/query?name=Raj
	
	@RequestMapping(value = "query",method = RequestMethod.GET)
	public String singleQueryParam(@RequestParam("name") String name) {
		return "Welcome user to Spring boot with query param "+name;
	}
	
	// http://localhost:8080/path/Raj
	
	@RequestMapping(value = "path/{name}",method = RequestMethod.GET)
	public String singlePathParam(@PathVariable("name") String name) {
		return "Welcome user to Spring boot with path param "+name;
	}
	
	// http://localhost:8080/testPost 
	
	@RequestMapping(value = "testPost",method = RequestMethod.POST)
	public String testPostMethod() {
		return "Welcome to Post method";
	}
	
	// http://localhost:8080/storeEmployee 
	// {"id":100,"name":"Ajay","salary":12000}
	
	@RequestMapping(value = "storeEmployee",method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeEmployee(@RequestBody Employee emp) {
		// write the logic to store the data in db means call service method 
		System.out.println(emp);               // it will call toString method 
		return "Welcome "+emp.getName();
	}
	
	
	// http://localhost:8080/updateEmployee 
		// {"id":100,"salary":12000}
	
	@RequestMapping(value = "updateEmployee",method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateEmployee(@RequestBody Employee emp) {
		// write the logic to store the data in db means call service method 
		System.out.println(emp);               // it will call toString method 
		return "Welcome user your salary is "+emp.getSalary();
	}
	
	// http://localhost:8080/deleteEmployee/100
	
	@RequestMapping(value = "deleteEmployee/{id}",method = RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable("id") int id) {
		return "Employee record deleted with id as "+id;
	}
	
}


