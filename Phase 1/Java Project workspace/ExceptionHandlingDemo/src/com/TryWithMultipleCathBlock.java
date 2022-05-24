package com;

public class TryWithMultipleCathBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		String str ="a1";		// value of str 1, 2, 0 and a1
		// str value 1 no exception 
		// str value 0 arithmetic 
		// str value 2 array index 
		// str value a1 number format exception 
		int res[]= {0,20};
		try {
			int result = 100/res[Integer.parseInt(str)];
			System.out.println("Result "+result);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic "+e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array "+e);
		}catch(NumberFormatException e) {
			System.out.println("Number format "+e);
		}
		System.out.println("Done");
	}

}
