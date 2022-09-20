package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.service.Operation;

class OperationTest {

	@Test
	void testAdd() {
		//fail("Not yet implemented");
		Operation op = new Operation();
		int result = op.add(100, 200);
		assertEquals(300, result);
	}
	@Test
	public void testSub() {
		Operation op = new Operation();
		int result = op.sub(100, 50);
		assertEquals(50, result);
	}
	@Test
	public void testMul() {
		Operation op = new Operation();
		int result = op.mul(10, 5);
		assertEquals(50, result);
	}
	@Test
	public void testDiv() {
		Operation op = new Operation();
		int result = op.div(100, 50);
		assertEquals(2, result);
	}
}
