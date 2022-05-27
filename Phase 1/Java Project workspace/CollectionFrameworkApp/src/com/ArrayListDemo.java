package com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println("Get the element using index position "+al.get(1));
		al.add(1, 100);		// in 1 index position we added 100
		System.out.println("Get the element using index position "+al.get(1));
		System.out.println(al);
		al.set(2, 200);		// in 2 index position we replace value by 200
		System.out.println(al);
		al.remove(3);		// remove using index position 
		al.remove(new Integer(40));	// remove using value 
		System.out.println(al);
	}

}
