package com.java.program;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		int i;
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter number :");
		i=s.nextInt();
		if(i%2==0)
		{
			System.out.println(i+" is even number");	
		}
		else
		{
			System.out.println(i+" is odd number");
		}

	}

}
