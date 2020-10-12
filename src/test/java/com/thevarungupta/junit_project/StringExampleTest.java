package com.thevarungupta.junit_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringExampleTest {
	
	// ABCD = false
	// ABAB = true
	// A = false
//	@Test
//	public void TestForcompareFirstAndLastChactersAreSame() {
//		StringExample se = new StringExample();
//		assertEquals(se.compareFirstAndLastChactersAreSame("ABAB"), "ABAB");
//	}
	
	@Test
	public void TestForcompareFirstAndLastChactersAreSame_Negative() {
		StringExample se = new StringExample();
		boolean actualValue = se.compareFirstAndLastChactersAreSame("ABAB");
		boolean expectedValue = true;
		//assertEquals(actualValue, expectedValue);
		//assertTrue(actualValue);
		assertFalse(actualValue);
		//assertFalse(actualValue, false);
	}

}
