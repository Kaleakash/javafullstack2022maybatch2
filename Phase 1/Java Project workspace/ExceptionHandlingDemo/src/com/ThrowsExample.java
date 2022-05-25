package com;

public class ThrowsExample {

	public static void dis1() throws Exception{
		//try {
		int a=10/0;
		//}catch(Exception e) {}
		System.out.println("This is dis1 method");
	}
	public static void dis2() throws Exception{
		//try {
		dis1();
		//}catch(Exception e) {}
		System.out.println("This is dis2 method");
	}
	public static void main(String[] args) throws Exception{
		//try {
		dis2();
		//}catch(Exception e) {}
		System.out.println("This is main method");
	}

}
