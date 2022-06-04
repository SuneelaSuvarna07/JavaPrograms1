package com.java.program;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int n = s.nextInt();
		int r, temp = 0;
		int pal = n;

		while (n > 0) {
			r = n % 10;
			temp = temp * 10 + r;
			n = n / 10;
		}
		if (pal == temp) {
			System.out.println("Digit is palidrome");
		} else {
			System.out.println("Digit is not palidrome");
		}

	}

}
