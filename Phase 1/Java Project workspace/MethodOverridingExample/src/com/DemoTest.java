package com;

public class DemoTest {

	public static void main(String[] args) {

		Honda hh = new Honda();
		hh.speed();					// calling super class method , re-usability of method 
		hh.color();					// its own method 
		
		Pulsar pu = new Pulsar();
		pu.speed();				// calling super class method override the method 
		pu.color();				// its own method 
		
		Tvs tv = new Tvs();
		tv.speed();						// it will merge the code 
		tv.color();
	}

}
