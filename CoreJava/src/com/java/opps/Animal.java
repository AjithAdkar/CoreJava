package com.java.opps;


public  class Animal implements Printable {
	
	public Animal() {}

	final protected Object eat() throws ArrayIndexOutOfBoundsException {
		System.out.println("All");
		return null;
	}
	public void sleep() {
		System.out.println("Sleeping");
	}
	public void b(){System.out.println("Animal method");}  
}  
	
