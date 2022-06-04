package strings;

import java.util.ArrayList;

public class FindDuplicates3 {

	public static void main(String[] args) {
		String inputString = "my ya my a";

		printDuplicates(inputString);
	}

	public static void printDuplicates(String s) {

		int size = s.length();
		int count = 0;
		ArrayList<Character> al = new ArrayList<Character>();

		for (int i = 0; i < size; i++) 
		{
			char c = s.charAt(i);

			for (int j = 0; j < size; j++) 
			{
				char c1 = s.charAt(j);
				if (c1 != c) 
				{
					continue;
				}
				count++;
			}
			if (!al.contains(c)) 
			{
				if (count > 0 && c != ' ')
				{
					System.out.println(c + "----" + count);
				}
				al.add(c);
			}
			count = 0;
		}

	}

}
