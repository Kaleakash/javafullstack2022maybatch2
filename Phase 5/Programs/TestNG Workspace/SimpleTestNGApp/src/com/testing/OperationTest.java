package com.testing;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.service.Operation;

public class OperationTest {
  @Test
  @Ignore				// @Disable 	in jUnit testing 
  public void testAdd() {
	  Operation op = new Operation();
	  int result = op.add(10, 20);
	  assertEquals(30, result);
  }
  @Test
  public void testSub() {
	  Operation op = new Operation();
	  int result = op.sub(100, 50);
	  assertEquals(50, result);
  }
  @Test
  @Ignore	
  public void testMul() {
	  Operation op = new Operation();
	  int result = op.mul(4, 5);
	  assertEquals(20, result);
  }
  @Test
  public void testDiv() {
	  Operation op = new Operation();
	  int result = op.div(100, 50);
	  assertEquals(2, result);
  }
}
