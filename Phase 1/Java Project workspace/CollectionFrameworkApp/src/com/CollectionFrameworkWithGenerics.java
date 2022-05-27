package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionFrameworkWithGenerics {

	public static void main(String[] args) {
		// without generics 
//		List ll = new ArrayList();
//		ll.add(100);
//		ll.add("Ravi");
//		ll.add(true);
//		ll.add(100.20);
//		
//		Object obj = ll.get(1);
//		Integer i = (Integer)obj;
//		int n = i.intValue();
//		System.out.println(n);
		
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(100);		// auto-boxing : converting primitive to object. 
		ll.add(200);
		ll.add(300);
		//ll.add("Ravi");
		
		int n = ll.get(0);	// auto-unboxing : converting object to primitive 
		System.out.println(n);
	}

}
