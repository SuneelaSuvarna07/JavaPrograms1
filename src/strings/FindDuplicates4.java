package strings;

import java.util.ArrayList;

public class FindDuplicates4 {
	
	public static void main(String[] args) {
		String s="abhi aabhi barish";
		int count=0;
		ArrayList<Character>arrayChar=new ArrayList();
		
		for(int i=0;i<s.length();i++)
		{
			char ci=s.charAt(i);
			
			for(int j=0;j<s.length();j++)
			{
					char cj=s.charAt(j);
					if(ci!=cj)
					{
						continue;
					}
					count++;
					
			}
			
			if(!arrayChar.contains(ci))
			{
				if(count>1&&ci!=' ')
				{
					System.out.println(ci+ " is displayed "+count+" times");
				}
				arrayChar.add(ci);
			}
			count=0;
			
			
		}
		for(char c:arrayChar)
		{
			System.out.println(c);
		}
	}
	
	
	

}
