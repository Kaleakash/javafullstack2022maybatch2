package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue q1 = new LinkedList();
		Queue q2 = new PriorityQueue();

		q1.add(4);
		q1.add(1);
		q1.add(3);
		q1.add(5);
		q1.add(6);
		System.out.println(q1);
		System.out.println(q1.peek());		// it will display the first element 
		System.out.println(q1);
		System.out.println(q1.poll());	// it will remove the first element from queue 
		System.out.println(q1);	
		
		q2.add(4);
		q2.add(1);
		q2.add(3);
		q2.add(5);
		q2.add(6);
		System.out.println(q2);
		System.out.println(q2.peek());		// it will display the first element 
		System.out.println(q2);
		System.out.println(q2.poll());	// it will remove the first element from queue base 
										// upon lower priority 
		System.out.println(q2);	
	}

}
