package com.java.program;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacentDiffArray {

	public static void main(String[] args) {

		int a[] = { 30, 20, 9, 15, 1 };
		int diff = 0;
		int v;
		

		for (int i = 0; i < a.length - 1; i++) {
			v = a[i] - a[i + 1];
			if (diff < v) {
				diff = v;
			}
		}
		System.out.println(diff);
		
	
	}

}
