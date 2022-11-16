package com.java.opps.downcast.abstraction;

public  class NokiaG60 extends Phone {

	@Override
	 void camera() {
System.out.println("12 mp front cam, 42 mp rear cam");		
	}

	@Override
	void gps() {
 System.out.println("High precision dualband GPS");		
	}

	@Override
	void internet4g() {
System.out.println("400 MBPS internet speed");		
	}
	

}
