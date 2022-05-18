package com;

public class Employee {
	int id;
	String name;
	float salary;
	
	void displayEmpInfo() {
		System.out.println("Employee details are ");
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
	
	Employee() {
		System.out.println("object created...");
	}
	
	void info() {
		System.out.println("This info method");
	}
}
