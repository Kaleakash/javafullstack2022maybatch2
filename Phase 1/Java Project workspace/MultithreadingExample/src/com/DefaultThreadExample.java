package com;

public class DefaultThreadExample {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);  // Thread[main,5,main];
		//1st main is name of thread 
		// 5 priority of the thread 
		//2nd main is group of the thread 
		String name = t.getName();
		int i = t.getPriority();
		ThreadGroup tg	= t.getThreadGroup();
		System.out.println("Name of the thread "+name);
		System.out.println("priority of the thread "+i);
		System.out.println("Group of the thread "+tg);
		t.setName("My Thread");
		t.setPriority(1); // min 1 and max 10 norm is 5
		System.out.println(t);
	}

}
