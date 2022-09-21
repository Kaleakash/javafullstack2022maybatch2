package com.testing;

import org.testng.annotations.Test;

public class BikeTest {

  @Test(groups = {"loan"})
  public void loanTest() {
    System.out.println("Bike loan testing logic");
  }

  @Test
  public void mailageTest() {
   // throw new RuntimeException("Test not implemented");
	  System.out.println("Bike mailage testing");
  }

  @Test
  public void speedTest() {
 //   throw new RuntimeException("Test not implemented");
	  System.out.println("Bike speed testing");
  }
}
