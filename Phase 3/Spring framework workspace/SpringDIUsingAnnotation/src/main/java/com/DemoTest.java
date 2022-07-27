package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Paritally use xml file to enable @Component annotation 
//	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//	Employee emp = (Employee)ac.getBean("employee");
//	System.out.println(emp);
//	emp.setId(101);
//	emp.setName("Raju");
//	emp.setSalary(15000);
//	Address add = emp.getAdd();
//	add.setCity("Mumbai");
//	add.setState("Mh");
//	emp.setAdd(add);
//	System.out.println(emp);
		
		// pure java base 
	
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println(emp);
		
		Product p1 = (Product)ac.getBean("pp");
		System.out.println(p1);
	}

}
