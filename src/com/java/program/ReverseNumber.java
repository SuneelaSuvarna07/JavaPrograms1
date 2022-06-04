package com.java.program;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n,r,rev=0;
		System.out.println("Enter the number below ");
		n=s.nextInt();	
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		
		System.out.println("Reversed number is "+rev);

			
		

	}

}
