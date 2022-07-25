package com;

public class Employee {
private int id;
private String name;
private float salary;

	Employee() {
		System.out.println("Object created...Empty");
	}
	
	public Employee(int id, String name, float salary) {
		super();
		System.out.println("Object created...Parameterized");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void displayEmpInfo() {
		System.out.println("This is Employee class method ");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
