package com.java.program;

public class SortingAnArray {

	public static void main(String[] args) {

		int a[] = { 3, 6, 2, 1, 4, 7, 5 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		// [3, 6, 2, 1, 4, 7, 5]
		// [2, 6, 3, 1, 4, 7, 5]
		// [1, 6, 3, 2, 4, 7, 5]
		// [1, 3, 6, 2, 4, 7, 5]
		// [1, 2, 6, 3, 4, 7, 5]
		// [1, 2, 3, 6, 4, 7, 5]
		// [1, 2, 3, 4, 6, 7, 5]
		// [1, 2, 3, 4, 5, 7, 6]
		// [1, 2, 3, 4, 5, 6, 7]
		for (int i : a) {
			System.out.println(i);
		}
	}
}
