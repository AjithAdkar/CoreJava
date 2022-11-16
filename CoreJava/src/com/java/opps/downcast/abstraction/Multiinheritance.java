package com.java.opps.downcast.abstraction;

public class Multiinheritance implements Jio, Airtel {

	public static void main(String[] args) {
		Airtel ritel = () -> System.out.println("ESIM Is AVilable");
		ritel.eSim();
	}

	@Override
	public void eSim() {
System.out.println("ESIM Is AVilable");		
	}

	@Override
	public void freeCall() {
		// TODO Auto-generated method stub
		Jio.super.freeCall();
	}
	

}
