package com;

public class Developer extends Employee{
	private String projectName;
	
	public void readDevInfo() {
		System.out.println("Enter ther project name");
		projectName = sc.next();
	}
	public void disDevInfo() {
		System.out.println("Project name is "+projectName);
	}
}
