package com.java.opps.downcast;

public class Main {
	void run(Object o) {
		if (o instanceof Dog) {
			((Dog) o).eat();
		}
		if (o instanceof Cat) {
			((Cat) o).eat();
		}
		
	}	
public static void main(String []args) {
	Animal animal= new Dog();
	new Main().run(animal);
	
	
}
}
