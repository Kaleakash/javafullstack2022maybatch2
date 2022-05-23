package com;

public class DemoTest {

	public static void main(String[] args) {
		A obj1  = new A();		// super class object created..
		obj1.dis1();

		B obj2 = new B();		// sub class object created..
		obj2.dis1();
		obj2.dis2();
		
		A obj3  = new B();	// creating sub class object and super class reference. possible 
		// with the help of this reference we can call only those methods 
		// which belong to super class and overrided method by sub class. 
		// this concept is konwn as run time polymoprhism 
		// here super class can be normal class or abstract class or interface. 
		obj3.dis1();
		//obj3.dis2();	// not possible 
		//B obj4 = new A();	// creating super class object and sub class reference. not possible 
	}

}
