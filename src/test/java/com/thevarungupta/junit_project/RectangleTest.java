package com.thevarungupta.junit_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {
	
	// arrange
	Rectangle rect = new Rectangle();
	
	@Test
	public void testForGetArea() {
		// arrange
		
		
		// act
		int actualResult = rect.getArea(10, 30);
		
		// assert
		int expectedResult = 200;
		assertEquals(actualResult, expectedResult);
		
	}
	
	@Test
	public void testForGetAreaWithMultipleValues() {
		//Rectangle rect = new Rectangle();
		
		assertEquals(rect.getArea(10, 50), 500);
		assertEquals(rect.getArea(20, 50), 1000);
		assertEquals(rect.getArea(5, 50), 250);
		
	}
	
	@Test
	public void testForGetParameter() {
		assertEquals(rect.getParameter(10, 20), 70);
		
		
	}
	

}
