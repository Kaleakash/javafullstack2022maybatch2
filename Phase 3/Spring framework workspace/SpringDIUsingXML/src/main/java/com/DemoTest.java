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
		
		Employee e5= (Employee)bf.getBean("emp1");
		System.out.println(e5);                      // it will call toString method 
		
		Employee e6= (Employee)bf.getBean("emp3");
		System.out.println(e6);
	}

}
