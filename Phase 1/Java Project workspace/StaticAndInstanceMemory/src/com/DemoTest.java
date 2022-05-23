package com;

public class DemoTest {

	public static void main(String[] args) {
			Test t1 = new Test();	// instance memory 
			Test t2 = new Test();
			t1.a=100;
				Test.b=200;
					t1.b=300;
					t2.a=400;
					Test.b=500;
					t2.b=600;
	t1.dis1();		// a= 100		b=600
	t2.dis1();		//a = 400		b=600
	}

}
