package com.thevarungupta.junit_project;

public class StringExample {
	
	public boolean compareFirstAndLastChactersAreSame(String str) {
		if(str.length() <= 1)
			return false;
		if(str.length() == 2)
			return true;
		
		String first2Char = str.substring(0,2);
		String last2Char = str.substring(str.length() -2);
		
		return first2Char.equals(last2Char);
			
	}
	
	
	

}
