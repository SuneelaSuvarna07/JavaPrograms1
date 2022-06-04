	package com.java.program;

public class CountOccuraceOfString {

	public static void main(String[] args) {
	
		String a="aaa";
		char b='a';
		int count=0;
		for (int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==b)
			{
				count++;
			}
		}
		
		System.out.println(count);

	}

}
