package com.java.programs;

public class Facto {
public void facto(int i) {
	int fact=1;
	for(int j=1;j<=i; j++ ) {
		fact*=j;
	}
	System.out.println(fact);
}
	public static void main(String[] args) {
 new Facto().facto(5);
	}

}
