package com.main;

import java.util.List;
import java.util.Scanner;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
//		EmployeeService es = new EmployeeService();
//		Employee emp = new Employee();
//		emp.setId(2);
//		emp.setName("Raghu");
//		emp.setSalary(15000);
//		String result = es.storeEmployee(emp);
//		System.out.println(result);
		
		EmployeeService es = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		float salary;
		String con="";
		int choice;
		String result;
		do {
			System.out.println("1:Add Employee 2: Update Employee Salary 3 : Delete Employee Details 4: findEmployeeDetails 5: All Employee Details");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1: System.out.println("Enter the id");
			           id = sc.nextInt();
			           System.out.println("Enter the name");
			           name = sc.next();
			           System.out.println("Enter the salary");
			           salary = sc.nextFloat();
						Employee emp1 = new Employee();
						emp1.setId(id);
						emp1.setName(name);
						emp1.setSalary(salary);
						result = es.storeEmployee(emp1);
						System.out.println(result);
						break;
			case 2: System.out.println("Enter the id");
			           id = sc.nextInt();
			           System.out.println("Enter the salary");
			           salary = sc.nextFloat();
			           Employee emp2 = new Employee();
			           emp2.setId(id);
			           emp2.setSalary(salary);
			           result = es.updateEmployee(emp2);
			           System.out.println(result);
			           break;
			case 3: System.out.println("Enter the id to delete the record");
			            id = sc.nextInt();
			            result = es.deleteEmployee(id);
			            System.out.println(result);
			            break;
			case 4:  System.out.println("Enter the id to find the details");
						id = sc.nextInt();
						Employee emp3 = es.findEmployeeById(id);
						if(emp3==null) {
							System.out.println("Record not present");
						}else {
							System.out.println("id is "+emp3.getId()+" Name is "+emp3.getName()+" Salary "+emp3.getSalary());
						}
						break;
			case 5 : System.out.println("All Employee Details");
							List<Employee> listOfEmp = es.findListOfEmp();
							for(Employee e : listOfEmp) {
								System.out.println("Id is "+e.getId()+" Name is "+e.getName()+" Salary is "+e.getSalary());
							}
							break;
			default: System.out.println("Wrong choice");
						break;
			}
			System.out.println("do you want to continue?");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Thank you!");
	}

}
