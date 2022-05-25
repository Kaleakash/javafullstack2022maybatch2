package com;
class AgeException extends Exception {
	public AgeException() {
	
	}
	public AgeException(String name) {
		super(name);		// this is use to call super class parameterzid constructor 
	}
}
public class ThrowExample {
	public static void main(String[] args) {
		int age=19;
		
		try {
			if(age<21) {
				//throw new Exception();			// Generic exception 
				//throw new ArithmeticException();		// specific exception 
				//int a=10/0;
				//throw new ArithmeticException("age must be > 21");	// specific with custom message 
				//throw new AgeException();  // user-defined exception 
				throw new AgeException("age must be > 21"); // user-defined exception with custom message 
			}
		}catch(Exception e) {
			System.out.println(e.toString());// name of the exception and message 
			System.out.println(e.getMessage()); // it will give only message 
		}
		System.out.println("finish");
	}

}
