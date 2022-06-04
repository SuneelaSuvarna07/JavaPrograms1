package strings;

import java.util.ArrayList;

public class FindDuplicates2 {

	public static void main(String[] args) {
		String inputString = "my ya my a";

		printDuplicates(inputString);
	}

	public static void printDuplicates(String s) {
	
		int size=s.length();
		int count=0;
		ArrayList<Character>al=new ArrayList<>();
		
		for(int i=0;i<size;i++)  //"my ya my a";
		{
			char ch=s.charAt(i);
			
			for(int j=0;j<size;j++)
			{
				char ch1=s.charAt(j);
				if(ch1!=ch)
				{
					continue;
				}
				count++;
			}
			if(!al.contains(ch))
			{
				if(count>1 && ch!=' ')
				{
					System.out.println("Char: " + ch + ", Count: " + count + " times.");
				}
				al.add(ch);
			}
			count=0;
		}
		
	}

}
