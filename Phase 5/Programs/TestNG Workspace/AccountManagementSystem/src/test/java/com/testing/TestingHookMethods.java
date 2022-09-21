package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestingHookMethods {
  @Test
  public void test1() {
	  System.out.println("While testing1 function ");
  }
  @Test
  public void test2() {
	  System.out.println("while testing2 funtion ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before normal method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after normal method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test case class");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test case class");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}
