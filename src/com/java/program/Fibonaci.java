package com.java.program;

public class Fibonaci {

	public static void main(String[] args) {
		// 0 1 1 2 3 5
		int first = 0;
		int second = 1;
		int next;

		for (int i = 00; i < 10; i++) {
			System.out.println(first);
			next = first + second;
			first = second;
			second = next;
		}

	}

}
