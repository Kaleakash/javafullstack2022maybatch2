package com;

import java.util.HashSet;
class A {}
class B {}
public class HashSetDemo {

	public static void main(String[] args) {
	HashSet hs = new HashSet();
//	hs.add(10);	// auto-boxing : automatically convert int to Object. 
//	int a=10;
//	Integer b = new Integer(a);
//	hs.add(b);
//	hs.add(10.10);
//	hs.add("Ravi");
//	hs.add(true);
//	A obj1 = new A();
//	B obj2 = new B();
//	hs.add(obj1);
//	hs.add(obj2);
//	System.out.println(hs);
	System.out.println("Size "+hs.size());
	System.out.println("Empty "+hs.isEmpty());
	hs.add(10);
	hs.add(40);
	hs.add(30);
	hs.add(20);
	hs.add(20);
	hs.add(50);
	System.out.println(hs);
	System.out.println("Size "+hs.size());
	System.out.println("Empty "+hs.isEmpty());
	System.out.println("Search "+hs.contains(100));
	System.out.println("Search "+hs.contains(10));
	hs.remove(40);
	System.out.println(hs);
	hs.clear();
	System.out.println(hs);
	System.out.println("Size "+hs.size());
	System.out.println("Empty "+hs.isEmpty());
	}

}
