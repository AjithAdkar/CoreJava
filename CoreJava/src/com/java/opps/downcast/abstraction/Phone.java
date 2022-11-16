package com.java.opps.downcast.abstraction;

public  abstract class Phone implements Telcom{
	protected Phone() {
		System.out.println(" frist gen Nokia mobile phone");
	}
	static void call() {
		System.out.println("calling");
	}
	protected void sms() {
		System.out.println("sms sent");
	}
	final public void game() {
		System.out.println( "play game");
	}
abstract void camera();
abstract void gps();
abstract void internet4g();
}
