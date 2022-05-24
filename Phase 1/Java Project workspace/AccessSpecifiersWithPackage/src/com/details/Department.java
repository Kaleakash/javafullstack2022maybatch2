package com.details;

import com.info.Employee;

public class Department {

	Employee emp = new Employee();
	
	public void disDeptInfo() {
		//System.out.println("a "+emp.a);
		//System.out.println("b "+emp.b);
		//System.out.println("c "+emp.c);
		System.out.println("d "+emp.d);	// only public can access
	}
}
