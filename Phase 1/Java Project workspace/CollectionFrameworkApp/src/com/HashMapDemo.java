package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap hm = new HashMap();		// unorder 
		//LinkedHashMap hm = new LinkedHashMap(); // maintain the order 
		TreeMap hm = new TreeMap();		// treemap asending order as key. so key must be same type
		//hm.put("a", "b");
		hm.put(2, "Ramesh");
		hm.put(3, "Ajay");
		hm.put(1, "Balaji");
		hm.put(4, "Dinesh");
		hm.put(1,"Raju");
		hm.put(6, "Ramesh");
		System.out.println(hm);
		System.out.println("using key we can get the value "+hm.get(2));
		System.out.println("Search "+hm.containsKey(1));
		System.out.println("Search "+hm.containsKey(100));
		System.out.println("Search "+hm.containsValue("Ramesh"));
		System.out.println("Search "+hm.containsValue("Ravi"));
	}

}
