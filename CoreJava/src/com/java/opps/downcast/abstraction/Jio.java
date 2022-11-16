package com.java.opps.downcast.abstraction;
@FunctionalInterface
public interface Jio {
	default void freeCall() {
		System.out.println("unlimited call");
	};
	 void eSim();
}
