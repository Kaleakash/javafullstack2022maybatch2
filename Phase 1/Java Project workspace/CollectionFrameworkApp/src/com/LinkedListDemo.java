package com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		System.out.println(ll);
		ll.add(1, 2000);
		System.out.println(ll);
		ll.remove(1);
		ll.remove(new Integer(300));
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.removeLast();
		ll.removeFirst();
		System.out.println(ll);
	}

}
