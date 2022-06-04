package com.java.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArray {

	public static void main(String[] args) {

		int a[] = { 2, 4, 5, 6, 7 };
		int b[] = { 3, 4, 2, 6, 7 };
		ArrayList<Integer> c = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				c.add(a[i]);
			}
		}

		Object[] arr = c.toArray();

		System.out.println(Arrays.toString(arr));
	}

}
