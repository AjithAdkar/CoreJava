package com.java.programs;

public class Amstrong {

 public void	amstrong(int i){
		int result=0;
		int temp=i;
		int digit=0;
		while(temp!=0) {
			temp/=10;
			digit++;
		}
		temp=i;
		while(temp!=0) {
		int q=temp%10;
		result+=Math.pow(q,digit);
		temp/=10;
		}
		 System.out.println(result);
	}
	public static void main(String[] args) {
		Amstrong am=new Amstrong();
		am.amstrong(11);
	}

}
