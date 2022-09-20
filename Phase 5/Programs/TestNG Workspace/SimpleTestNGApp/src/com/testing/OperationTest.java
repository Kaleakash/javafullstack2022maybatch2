package com.testing;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.service.Operation;

public class OperationTest {
  @Test
  public void testAdd() {
	  Operation op = new Operation();
	  int result = op.add(10, 20);
	  assertEquals(30, result);
  }
  
  
}
