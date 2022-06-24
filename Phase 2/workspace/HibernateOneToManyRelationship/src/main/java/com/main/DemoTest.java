package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Student;
import com.bean.Trainer;
import com.service.StudentService;
import com.service.TrainerService;

public class DemoTest {

	public static void main(String[] args) {
		
		// Trainer Record storing 
//		TrainerService ts = new TrainerService();
//		Trainer t1 = new Trainer();
//		t1.setTid(3);
//		t1.setTname("Mahesh");
//		t1.setTech("Angular");
//		String result = ts.storeTrainerDetails(t1);
//		System.out.println(result);
		
		// Student Record storing
//		StudentService ss = new StudentService();
//		Student s1 = new Student();
//		s1.setSid(105);
//		s1.setSname("Weeta");
//		s1.setAge(26);
//		s1.setTsid(4);
//		String result = ss.storeStudentDetails(s1);
//		System.out.println(result);
		
		// Storing Trainer as well as Student records together 
//		TrainerService ts = new TrainerService();
//		
//		Trainer t1 = new Trainer();
//		t1.setTid(5);
//		t1.setTname("Ram Kumar");
//		t1.setTech("React Native");
//		
//		Student s1 = new Student();
//		s1.setSid(105);
//		s1.setSname("Jeeta");
//		s1.setAge(25);
//		s1.setTsid(5);
//		
//		Student s2 = new Student();
//		s2.setSid(106);
//		s2.setSname("Heeta");
//		s2.setAge(26);
//		s2.setTsid(5);
//		
//		List<Student> listOfStd = new ArrayList<Student>();
//		listOfStd.add(s1);
//		listOfStd.add(s2);
//		
//		t1.setListOfStd(listOfStd);
//		String result = ts.storeTrainerDetails(t1);
//		System.out.println(result);
		
		// Find Trainer Details using trainer id
//		TrainerService ts = new TrainerService();
//		Trainer t = ts.findTrainer(4);
//		if(t==null) {
//			System.out.println("Trainer not present");
//		}else {
//			System.out.println("TName "+t.getTname());
//			List<Student> listOfStd=	t.getListOfStd();
//			System.out.println("Number of student under the trainer are "+listOfStd.size());
//			for(Student s : listOfStd) {
//				System.out.println("SName "+s.getSname()+" Age "+s.getAge());
//			}
//		}
		
		// Join with HQL or SQL 
		TrainerService ts = new TrainerService();
		//List<Object[]> ll  = ts.findTrainerAndStudent();
		List<Object[]> ll  = ts.findTrainerAndStudentWithCondition("Raj");
		Iterator<Object[]> ii = ll.iterator();
		while(ii.hasNext()) {
			Object obj[] = ii.next();
			System.out.println("Trainer Name "+obj[0]+" Tech "+obj[1]+" Student Name "+obj[2]);
		}
	}

}
