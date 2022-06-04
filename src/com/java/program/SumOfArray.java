package com.java.program;

public class SumOfArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 5, 15 };

		int sum = sumOfArray(a);
		System.out.println(sum);

	}

	public static int sumOfArray(int a[]) {
		int sum = 0;

		for (int val : a) {
			sum = sum + val;
		}
		return sum;
	}

}
