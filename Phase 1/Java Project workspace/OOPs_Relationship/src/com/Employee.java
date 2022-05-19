package com;

import java.util.Scanner;

public class Employee {
private int id;
private String name;
private float salary;
Scanner sc = new Scanner(System.in);
Address add = new Address();
public void readEmpInfo() {
	System.out.println("Enter the id");
	id = sc.nextInt();
	System.out.println("Enter the name");
	name  = sc.next();		// it is use to scan string value 
	System.out.println("Enter the salary");
	salary = sc.nextFloat();
	add.readAdd();
}

public void disEmpInfo() {
	System.out.println("Employee Details are");
	System.out.println("Id is "+id);
	System.out.println("Name is "+name);
	System.out.println("Salary is "+salary);
	add.disAdd();
}

}
