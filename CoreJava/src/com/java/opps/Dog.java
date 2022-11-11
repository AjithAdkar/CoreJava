package com.java.opps;

public class Dog  extends Animal{
	
	@Override
	public void eat() {
		System.out.println("Cooked food");
	}
	
	public void name( String name) {
		
		System.out.println(name);
	}

}
