package strings;

import java.util.Arrays;
import java.util.Collections;

public class CheckAnagram {

	public static void main(String[] args) {
		String firstString = "Army";
		String secondString = "mary";

		System.out.println("Check if the firstString and secondString is anagram of each other: "
				+ isAnagram(firstString, secondString));
		
	System.out.println(compareString(firstString,secondString));	
	}

	public static boolean isAnagram(String firstString, String secondString) {
		char[] firstStringCharArray = firstString.toLowerCase().toCharArray();
		char[] secondStringCharArray = secondString.toLowerCase().toCharArray();

		Arrays.sort(firstStringCharArray);
		Arrays.sort(secondStringCharArray);

		return Arrays.equals(firstStringCharArray, secondStringCharArray);

	}

	public static boolean compareString(String s1, String s2) {

		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2)) {
			return true;
		} else {
			return false;
		}

	}
}