package com;

public class TryAndCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
		int num[] = {10,20,30,40};
		String str = "a10";
		try {
		int res = a/b;	
		System.out.println("Result is "+res);
		int res1 = 100/num[3];
		System.out.println("Result is "+res1);
		System.out.println(str+100);
		int abc = Integer.parseInt(str); // it is use to convert string to integer
		System.out.println(abc+100);
		}catch(Exception e) {
			//System.out.println("I Take Care!");
			System.out.println(e.toString());   // it is use to display name of the exception 
		}
		System.out.println("Bye...");
		System.out.println("bye...");
	}

}
