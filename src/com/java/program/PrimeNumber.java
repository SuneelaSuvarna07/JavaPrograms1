package com.java.program;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the number below ");
		n=s.nextInt();
		boolean flag=true;
		
		if(n<=2)
		{
			System.out.println("Smallest prime number is 2");
		}

		for( i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not a prime number");
				flag=false;
				break;
				
			}
		}
		if(flag==true)
		{	
			System.out.println(n+" is  a prime number");
			
		}
	}

}
