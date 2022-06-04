package com.java.program;

public class RevereNumber {

	public static void main(String[] args) {
		
		int a=100;
		
		int rev=0;
		
		while(a>0)
		{
			 int r=a%10;
			 a=a/10;
			 rev=rev*10+r;
			 
		}
		
		 System.out.println(rev);
	}

}
