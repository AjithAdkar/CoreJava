package com.java.opps;

public class Dog  extends Animal{
	public static  void add(int a,float b) {
		System.out.println(a+b+" 1");	}
	public static int add(float a,int b) {
		return (int) (a+b);	}
//	@Override
//	protected String eat() throws ArithmeticException {
//		System.out.println("Cooked food");
//		return "hello";
//	}
	
	public void name( String name) {
		
		System.out.println(name);
	}
	
	public static Dog method(Animal a) {
		if(a instanceof Dog) {
			 	Dog f= (Dog)a;
			 	return f;}
		return null;}
		

}
