package com;

public class Employee {
private int id;
private String name;
private float salary;

void setValue(int id1, String name1, float salary1) {
	id = id1;
	name = name1;
	//salary  = salary1;
	if(salary1<0) {
		salary = 8000;
	}else {
		salary = salary1;
	}
}

void displayEmployeeInfo() {
	System.out.println(" id is "+id);
	System.out.println("name is "+name);
	System.out.println("salary is "+salary);
}
}
