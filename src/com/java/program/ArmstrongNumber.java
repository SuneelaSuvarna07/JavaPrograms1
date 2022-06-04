package com.java.program;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n, r, arm = 0;
		System.out.println("Enter the number below ");
		n = s.nextInt();
		int temp = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			arm = arm + r * r * r;
		}
		if (temp == arm) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not a Armstrong number");
		}

	}

}
