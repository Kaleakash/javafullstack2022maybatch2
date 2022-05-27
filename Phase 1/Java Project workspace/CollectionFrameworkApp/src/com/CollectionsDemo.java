package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
	List<String> names = new ArrayList<String>();
	names.add("Ravi");names.add("Ajay");names.add("Vijay");names.add("Mahesh");names.add("Lokesh");
	System.out.println("All names");
	for(String name:names) {
		System.out.print(name+" ");
	}
		Collections.sort(names);			// Asc
	System.out.println();
	System.out.println("After short");
	for(String name:names) {
		System.out.print(name+" ");
	}
		Collections.reverse(names);			// Desc
	System.out.println();
	for(String name:names) {
		System.out.print(name+" ");
	}
	
	}

}
