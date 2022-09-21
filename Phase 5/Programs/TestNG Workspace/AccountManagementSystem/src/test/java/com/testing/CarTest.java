package com.testing;

import org.testng.annotations.Test;

public class CarTest {

  @Test(groups = {"loan"})
  public void loanTest() {
	  System.out.println("Car loan testing");
   // throw new RuntimeException("Test not implemented");
  }

  @Test
  public void mailageTest() {
   // throw new RuntimeException("Test not implemented");
	  System.out.println("Car mailage testing");
  }

  @Test
  public void speedTest() {
    //throw new RuntimeException("Test not implemented");
	  System.out.println("Car speed testing");
  }
}
