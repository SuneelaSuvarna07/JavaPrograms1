package com.java.program;

public class NoOfDigits {

	public static void main(String[] args) {
		
		int n=153;
		int a=0;
		if(n<0)
		{
			a=n*-1;
		
		}
		else if (n==0)
		{
			a=0;
			
		}
		while(n>0)
		{
			n=n/10;
			a++;
			
		}
		System.out.println(a);
	}

}
