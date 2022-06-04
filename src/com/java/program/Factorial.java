package com.java.program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,i;
		int fact=1;
		System.out.println("Enter the number below ");
		n=s.nextInt();
		
		for( i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+ " is "+fact);

	}

}
