package com;

public class Manager extends Employee{
	private int numberOfEmp;
	public void readMgrInfo() {
		System.out.println("Enter the number of employee working under manager");
		numberOfEmp = sc.nextInt();
	}
	public void disMgrInfo() {
		System.out.println("Number of employee "+numberOfEmp);
	}
}

