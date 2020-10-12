package com.thevarungupta.junit_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testForAddNumbers() {
		// Arrange
		Calculator cal = new Calculator();
		
		// Act
		int actualResult = cal.addNumbers(10, 20);
		
		// Assert
		int expectedResult = 30;
		assertEquals(actualResult, expectedResult);
	}
	
	
	
}
