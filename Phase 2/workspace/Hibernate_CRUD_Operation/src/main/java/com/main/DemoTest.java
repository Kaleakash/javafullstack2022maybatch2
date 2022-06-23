package com.main;

import java.util.List;
import java.util.Scanner;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService es = new EmployeeService();
		int id;
		String name;
		float salary;
		String con ="";
		int choice;
		String result;
		do {
			System.out.println("1:Add Employee 2: Employee Employee Salary 3 : Delete Employee 4: Find Employee 5: All Employee Details "
					+ "6 : Employee details with salary condition ");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch(choice) {
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
			case 3:System.out.println("plz enter the id to delete the record");
			            id = sc.nextInt();
			            result = es.deleteEmployee(id);
			            System.out.println(result);
			            break;
			case 4 : System.out.println("Find the record using id");
			             id = sc.nextInt();
			             Employee emp3 = es.findEmployee(id);
			             if(emp3!=null) {
			            	 System.out.println(" id is "+emp3.getId()+" Name is "+emp3.getName()+" Salary is "+emp3.getSalary());
			             }else {
			            	 System.out.println("Record not present");
			             }
			             break;
			case 5 : System.out.println("All Employee details");
			            List<Employee> listOfEmp = es.findAllEmployee();
			            for(Employee e : listOfEmp) {
			            	System.out.println("Id is "+e.getId()+" Name is "+e.getName()+" Salary is "+e.getSalary());
			            }
			            break;
			case 6 :System.out.println("Plz enter the salary");
			            salary = sc.nextFloat();
			            List<Employee> listOfEmpWithSalaryCondition = es.findEmployeeWithCondition(salary);
			            for(Employee e : listOfEmpWithSalaryCondition) {
			            	System.out.println("Id is "+e.getId()+" Name is "+e.getName()+" Salary is "+e.getSalary());
			            }
			            break;
			 default :System.out.println("Wrong choice");
			             break;
			}
			System.out.println("Do you want to continue?");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));
	}

}
