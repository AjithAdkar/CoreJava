package com.java.programs;

public class Factorial {
	static int r=0;
	static int s=1;
//	recursion use more resource.
	 public  void fact(int number) {
		 r=r+s;
		 int temp=s;
		 s=r;
		 r=temp;
		 System.out.println(r);
		 if (number!=0) 
		 fact(number-1);
	 }
//	 without recursion 
	  public void facto(int number) {
		  int r=0;
		  int s=1;
		  int temp;
		  for(int i=0; i<=number;i++) {
			  r=r+s;
			  temp= r;
			  r=s;
			  s=temp;
			  System.out.println(r); 
		  }
	  }
	public static void main(String[] args) {
		Factorial f= new Factorial();
		f.fact(10);
		f.facto(10);
	}
}
