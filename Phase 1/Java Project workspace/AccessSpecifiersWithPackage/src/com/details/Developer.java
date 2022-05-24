package com.details;
import com.info.*;
public class Developer extends Employee{

	public void disDevInfo() {
		//System.out.println("a "+a);	// private can't access
		//System.out.println("b "+b);		// default can't access 
		System.out.println("c "+c);		// we can access because it sub class 
		System.out.println("d "+d);
	}
}
