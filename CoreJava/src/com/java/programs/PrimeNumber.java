package com.java.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		 try(  Scanner sc= new Scanner(System.in)){
			  System.out.println("Enter the Number:");
			  primenumber(sc.nextInt());
			}catch(InputMismatchException e) { System.out.println("enter valid input...!");  }}

	public static void primenumber(int number) {
		boolean flag= false;
		     if (number == 1|number == 0) {
		    	 System.out.println(number+ ": is not Prime Number");
		     }
		     else {
		    	 for (int i=2;i<=Math.sqrt(number);i++) {
		    		 if(number % i==0) {
		    		 flag=true;
		    		 System.out.println(number+ ": is Prime Number");
		    		 break;
		    		 }
		    	 }
		    	 if (flag==false) {
		    		 System.out.println(number+ ": is not Prime Number");
		    	  }
		      }
		     }
		
	}