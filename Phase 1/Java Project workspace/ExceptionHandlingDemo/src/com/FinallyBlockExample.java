package com;

public class FinallyBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		try {
			int res = 10/1;
			System.out.println("No Exception");
		}catch(Exception e) {
			System.out.println("Catch block");
		}finally {
			System.out.println("Finally block");
		}
		System.out.println("Normal Statement");
	}

}
