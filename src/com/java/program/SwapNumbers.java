package com.java.program;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int m,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number m= ");
		m=s.nextInt();
		System.out.println("Enter second number n= ");
		n=s.nextInt();
		
		m=m+n;
		n=m-n;
		m=m-n;
		
		System.out.println("Swapped first number m= "+m);
		System.out.println("Swapped second number n= "+n);
	}

}
