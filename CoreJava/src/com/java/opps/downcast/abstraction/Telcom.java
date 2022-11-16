 	package com.java.opps.downcast.abstraction;

public interface Telcom {
	int c=1;
	  default void h() { dance();
		 System.out.println("af");
	 }
	  static void hel() {
			System.out.println("oh no");
	}
 private void dance() {
	  System.out.println("dance india dance");
}
}
