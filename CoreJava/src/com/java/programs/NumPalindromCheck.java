package com.java.programs;

public class NumPalindromCheck {
  public static  void check(int i) {
	 int num=i;
	 int m;
	 int rev=0;
	 while (num!=0) {
		 m=num%10;
		 rev=(rev*10)+m;
		 num/=10;
	 }
	  if(rev==i)
	 System.out.println(i+" is a palindrom number");
	  else System.out.println(i+" is not a palindrom number");
	  
  }
	public static void main(String[] args) {
 check(19971);
		
		
	}

}
