package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		ss.push(500);
		System.out.println(ss);
		System.out.println(ss.pop()); // it is use to remove top most element 
		System.out.println(ss);
		System.out.println(ss.peek()); // it will check the top most element 
		System.out.println(ss);
		System.out.println(ss.search(100));	// it present it will give position 
		System.out.println(ss.search(1000));	// if not present it will give -1
	}

}
