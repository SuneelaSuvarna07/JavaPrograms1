package strings;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if (s.contains(s))

			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'i'
						|| s.charAt(i) == 'o' || s.charAt(i) == 'u') {
					System.out.println("first vowel is " + s.charAt(i));
					break;

				}

			}

	}

}
