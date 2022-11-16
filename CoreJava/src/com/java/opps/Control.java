package com.java.opps;
class Call{  
	void invoke(Object p){ 
	if(p instanceof Printable){  
		Reff a= (Reff) p;//Downcasting   
	a.a();  
	}  
	if(p instanceof  Printable){  
		Animal b= (Animal) p;//Downcasting   
	b.b();  
	}  
	  
	}} 
public class Control {
	public static void main(String[] args) {
//		Printable p=new Animal();  
		Call c=new Call();  
//		c.invoke(new Reff()); 
//		c.invoke( new Animal());
//	new Animal().b();
	}    
}  
