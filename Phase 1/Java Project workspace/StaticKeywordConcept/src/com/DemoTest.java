package com;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticData sd = new StaticData();
		sd.a=10;		// instance variable 
		StaticData.b=20;	// static variable 
		
		sd.dis1();// non static method we can call through object 
		StaticData.dis2(); // static method we can call through class name
		
		sd.b=30;	// static variable we can access throug object also 
		sd.dis2(); // static method we can call through object also 
	}

}
