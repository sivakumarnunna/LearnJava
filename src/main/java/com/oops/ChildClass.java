package com.oops;
/**
 * 
 * @author sivak
 *Here Childclass was implemented by Parent class
 */
public class ChildClass extends ParentClass {
	
	
	/**
	 * same method name from parent class and same arguments from parent class.
	 * Implementation will be different in child class
	 */
	
	@Override
	public void eat() {
		
		System.out.println("childeres eat noveg");
	}
	

}
