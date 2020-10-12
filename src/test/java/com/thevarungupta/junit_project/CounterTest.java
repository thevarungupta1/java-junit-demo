package com.thevarungupta.junit_project;

import static org.junit.Assert.*;

import org.junit.*;

public class CounterTest {
	
	Counter c;
	
	@Before
	public void setup() {
		System.out.println("Before Test");
		c = new Counter();
	}
	
	@BeforeClass
	public static void first() {
		System.out.println("Before class");
	}
	
		
	@Test
	public void TestForCounterIncrement() {
		System.out.println("Incement Test");
		int countValue = c.increment();
		assertEquals(countValue, 1);
	}
	
	@Test
	public void TestForCounterDecrement() {
		System.out.println("Decrement Test");
		int countValue = c.decrement();
		assertEquals(countValue, -1);
	}
	
	@After
	public void tearDown() {
		System.out.println("Afters Test");
		c = null;
	}
	
	@AfterClass
	public static void last() {
		System.out.println("After class");
	}

}
