package com;

public class DemoTest {

	public static void main(String[] args) {
		Manager mgr = new Manager();
		System.out.println("Enter the manager details");
		mgr.readEmpInfo();     
		mgr.readMgrInfo();
		
		Developer dev = new Developer();
		System.out.println("Enter the developer details ");
		dev.readEmpInfo();
		dev.readDevInfo();
		
		mgr.disEmpInfo();
		mgr.disMgrInfo();
		
		dev.disEmpInfo();
		dev.disDevInfo();

	}

}
