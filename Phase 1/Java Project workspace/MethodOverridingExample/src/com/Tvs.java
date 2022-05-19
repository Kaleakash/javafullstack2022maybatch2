package com;

public class Tvs extends Bike{

	public void color() {
		System.out.println("Red");
	}
	
	public void speed() {
		super.speed();                    // calling super class speed method code 
		System.out.println("20km/hr");	// + sub class method code 
	}
}
