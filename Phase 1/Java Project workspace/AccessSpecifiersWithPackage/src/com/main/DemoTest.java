package com.main;

import com.details.Department;
import com.details.Developer;
import com.info.Employee;
import com.info.Manager;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.disEmpInfo();
		//System.out.println("a "+emp1.a); // private 
		//System.out.println("b "+emp1.b); //  default 
		//System.out.println("c "+emp1.c); // protected 
		System.out.println("a "+emp1.d); // public 
		
		Manager mgr = new Manager();
		mgr.disMgrInfo();
		
		Developer dev = new Developer();
		dev.disDevInfo();
		
		Department dept = new Department();
		dept.disDeptInfo();
	}

}
