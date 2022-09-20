package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HookMethods {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("This function call only once before all test method");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("This function call only once after all test method");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("This funtion called before each test method");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("this function called after each test method");
	}

	@Test
	void test1() {
		System.out.println("While testing.......test 1 method");
	}

	@Test
	void test2() {
		System.out.println("While testing....... test 2 method");
	}
}
