package strings;

import java.util.Scanner;

public class ReversString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0;
		if (sc.hasNextInt()) {
			n = sc.nextInt();

			int r = 0;
			int rev = 0;

			while (n != 0)

			{
				r = n % 10;// 6
				n = n / 10; // 1387
				rev = r + rev * 10;// 60
			}

			System.out.println(rev);

		} else {
			System.out.println("Error,Please enter a positive integer number");
		}

	}

}
