package com;

public class DemoTest {

	public static void main(String[] args) {
		//System.out.println(name);		// we can't access variable directly 
		// displayEmployeeInfo();		// we can't call method directly 
		
		Employee emp1 = new Employee();
		//emp1.id=100;
		//emp1.name="Ramesh";
		//emp1.salary=-14000;
		emp1.setValue(100, "Ramesh", -14000);
		emp1.displayEmployeeInfo();

	}

}
