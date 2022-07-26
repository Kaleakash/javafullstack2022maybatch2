package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
//		Employee emp = new Employee();
//		emp.displayEmpInfo();
		
		Resource rs = new ClassPathResource("beans.xml");	
		BeanFactory bf = new XmlBeanFactory(rs);
//		Employee e1 = (Employee)bf.getBean("emp1");   // pull the object from container 
//		e1.displayEmpInfo();
//		
//		Employee e2 = (Employee)bf.getBean("emp1");
//		e2.displayEmpInfo();
//		
//		Employee e3 = (Employee)bf.getBean("emp2");
//		e3.displayEmpInfo();
//		
//		Employee e4 = (Employee)bf.getBean("emp2");
//		e4.displayEmpInfo();
		
//		Employee e5= (Employee)bf.getBean("emp1");
//		System.out.println(e5);                      // it will call toString method 
//		
//		Employee e6= (Employee)bf.getBean("emp3");
//		System.out.println(e6);
		
//		Employee e7 = (Employee)bf.getBean("emp4");
//		System.out.println(e7);
		
//		Employee e8 = (Employee)bf.getBean("emp5");
//		System.out.println(e8);
		
		
//		Employee e9 = (Employee)bf.getBean("emp6");
//		System.out.println(e9);
		
//		Address a1 = (Address)bf.getBean("add1");
//		System.out.println(a1);
		
//		Employee e10 = (Employee)bf.getBean("emp7");
//		System.out.println(e10);
		
//		Employee e11 = (Employee)bf.getBean("emp8");
//		System.out.println(e11);
		
		Employee e12 = (Employee)bf.getBean("emp9");
		System.out.println(e12);

	}

}
