package com.java.program;

public class PyramidPrgm {

	public static void main(String[] args) {
		// *

		// * *

		// * * *

		// * * * *

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println("\n");
		}

		// 0

		// 1 1

		// 2 2 2

		// 3 3 3 3

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i);
				System.out.print("\t");
			}
			System.out.println("\n");
		}

		// 0

		// 0 1

		// 0 1 2

		// 0 1 2 3

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("\n");
		}

		// A

		// B B

		// C C C

		// D D D D
		char c = 'A';
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(c);
				System.out.print("\t");

			}
			System.out.println("\n");
			c++;
		}
	}

}
