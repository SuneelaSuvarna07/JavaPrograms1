package stringdatastructre;

public class RotationOfString {

	// A simple Java program to generate all rotations
	// of a given string

	
		// Print all the rotated string.
		static void printRotatedString(String str)
		{
			int n = str.length();
		
			StringBuffer sb = new StringBuffer(str);
			// Concatenate str with itself
			sb.append(str);
		
			// Print all substrings of size n.
			// Note that size of sb is 2n
			for (int i = 0; i < n; i++)
			{
				for (int j=0; j != n; j++)
				{
					int k=i+j;
					char s = sb.charAt(k);
					System.out.print(s);
				
				}
				System.out.println();
			}
		}
		
		// Driver method
		public static void main(String[] args)
		{
			String str = new String("geeks");
			printRotatedString(str);
		}
	}


