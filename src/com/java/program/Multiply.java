package com.java.program;

public class Multiply {

	public static void main(String[] args) {

		int multi;
		multi = mul(5, 3);
		System.out.println(multi);

	}

	public static int mul(int m, int n) {
		int mul = 0;
/*
		for (int i = 0; i < m; i++) {
			mul = mul + n;
		}*/
		int i=0;
		while(i<m)
		{
			mul=mul+n;
			i++;
		}
		
		
		return mul;
	}

}
