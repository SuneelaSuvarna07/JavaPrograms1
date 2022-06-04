package com.java.program;

public class Zeta3_withoutloop {

	public static void main(String[] args) {

		int i = 1;
		printNO(i);

	}

	public static void printNO(int i) {
		if (i <= 100) {
			System.out.println(i++);
			printNO(i);
		}

	}
}
