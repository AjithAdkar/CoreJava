package com.java.opps;


public class Animal {
	int age;
	public Animal(int age) {
		 this.age= age;
	}

	protected Object eat() throws ArrayIndexOutOfBoundsException {
		System.out.println("All");
		return null;
	}
	public void sleep() {
		System.out.println("Sleeping");
	}
	
}
