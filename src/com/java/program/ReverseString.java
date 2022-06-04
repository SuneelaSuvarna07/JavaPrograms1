package com.java.program;

import java.util.ArrayList;

public class ReverseString {

	public static void main(String[] args) {
	
		String s="madam";
		String s1="";
		char temp;
		
		for (int i=s.length()-1;i>=0;i--)
		{
			
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
	
		if(s.equals(s1))
		{
			System.out.println("String "+s+" is palidrome");
		}
		else
		{
			System.out.println("String "+s+" is not palidrome");
		}
	}
}
