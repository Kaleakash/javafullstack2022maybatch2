package com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//HashSet lhs = new HashSet();
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(30);
		lhs.add(20);
		lhs.add(10);
		lhs.add(50);
		lhs.add(40);
		System.out.println(lhs);
	}

}
