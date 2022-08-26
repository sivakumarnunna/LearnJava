package com.oops;

public class ParentClass {
	
	
	
	
	public void eat() {
		System.out.println("parents eat veg");
	}
	
	public  static void sleep() {
		
		System.out.println("sleep");
	}
	
	/**
	 * 
	 * Method overloading is same method name with different arguments.
	 */
	
	public int add(int a, int b, int c) {

		return a + b + c;
	}

	public int add(int a, int b) {

		return a + b;
	}

}
