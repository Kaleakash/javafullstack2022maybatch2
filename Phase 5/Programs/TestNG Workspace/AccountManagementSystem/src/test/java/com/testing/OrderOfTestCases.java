package com.testing;

import org.testng.annotations.Test;

public class OrderOfTestCases {
  @Test(priority = 4)
  public void a() {
	  System.out.println("a testing ");
  }
  @Test(priority = 1)
  public void d() {
	  System.out.println("d testing ");
  }
  @Test(priority = 2)
  public void c() {
	  System.out.println("c testing ");
  }
  @Test(priority = 3)
  public void b() {
	  System.out.println("b testing ");
  }
  @Test(priority = 3)
  public void e() {
	  System.out.println("e testing ");
  }
}
