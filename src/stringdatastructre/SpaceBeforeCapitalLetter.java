package stringdatastructre;

import java.util.*;
import java.lang.*;
import java.io.*;


public class SpaceBeforeCapitalLetter {



//Java program to put spaces between words starting
//with capital letters.

	// Function to amend the sentence
	//BruceWayneIsBatman
	public static void amendSentence(String sstr)
	{
		char[] str=sstr.toCharArray();
		
		// Traverse the string
		for (int i=0; i < str.length; i++)
		{
			// Convert to lowercase if its
			// an uppercase character
			 char c=str[i];
			
			if (str[i]>='A' && str[i]<='Z')
			{
				str[i] = (char)(str[i]+32);
				
				// Print space before it
				// if its an uppercase character
				if (i != 0)
					System.out.print(" ");
	
				// Print the character
				System.out.print(str[i]);
			}
	
			// if lowercase character
			// then just print
			else
			System.out.print(str[i]);
		}
	}	
	
	// Driver Code
	public static void main (String[] args)
	{
		String str ="hoW aRE YOu";
		amendSentence(str);
	}
}

