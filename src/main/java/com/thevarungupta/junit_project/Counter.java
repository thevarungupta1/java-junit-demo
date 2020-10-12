package com.thevarungupta.junit_project;

public class Counter {
	
	private int count = 0;
	
	public Counter() {
		//count++;
	}
	
	public int increment() {
		this.count++;
		return this.count;
	}
	
	public int decrement() {
		this.count--;
		return this.count;
	}


}
