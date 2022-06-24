package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Students;
import com.bean.Technologies;

public class DemoTest {

	public static void main(String[] args) {

		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		Students s1   = new Students();
		s1.setSid(1);
		s1.setSname("Ajay");
		
		List<Technologies> listOfTech = new ArrayList<Technologies>();
		Technologies t1 = new  Technologies();
		t1.setTid(100);
		t1.setTechname("Java");
		
		Technologies t2 = new Technologies();
		t2.setTid(101);
		t2.setTechname("Python");
		listOfTech.add(t1);
		listOfTech.add(t2);
		s1.setListOfTech(listOfTech);
		
		tran.begin();
		session.save(s1);
		tran.commit();
		System.out.println("Record stored successfully");
	}

}
