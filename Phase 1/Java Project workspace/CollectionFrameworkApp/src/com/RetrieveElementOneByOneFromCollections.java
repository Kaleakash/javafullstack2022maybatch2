package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class RetrieveElementOneByOneFromCollections {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("Ravi"); names.add("Ramesh"); names.add("Ajay"); names.add("Vijay");
		System.out.println(names);
		System.out.println("Retrieve the names one by one using for each loop");
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println("Retrieve the names one by one using iterator");
		Iterator<String> li = names.iterator();
		while(li.hasNext()) {
			String name = li.next();
			System.out.println(name);
		}
		List<String> names1 = new ArrayList<String>();
		names1.add("Ravi"); names1.add("Ramesh"); names1.add("Ajay"); names1.add("Vijay");
		System.out.println(names1);
		System.out.println("Retrieve the names one by one using iterator display list");
		Iterator<String> li1 = names1.iterator();
		while(li1.hasNext()) {
			String name = li1.next();
			System.out.println(name);
		}
		System.out.println("Retrieve the names one by one using ListIterator - forward");
		ListIterator<String> li2= names1.listIterator();
		while(li2.hasNext()) {
			String name = li2.next();
			System.out.println(name);
		}
		System.out.println("Retrieve the names one by one using ListIterator - backward");
		while(li2.hasPrevious()) {
			String name = li2.previous();
			System.out.println(name);
		}
	}
}
