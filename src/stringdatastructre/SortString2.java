package stringdatastructre;

import java.util.Arrays;

public class SortString2 {
	
	static final int MAX_CHAR = 26;

	public static void main(String[] args) {
		
		char c[]=sortString("geeksforgeeks");
		System.out.println(c);
		
	}
	
		static char[] sortString(String str) {
			
			char c[]=str.toCharArray();
			
			for(int i=0;i<c.length-1;i++)
			{
				if(c[i]>c[i+1])
				{
					char temp=c[i];
					c[i]=c[i+1];
					c[i+1]=temp;
					i=-1;
				}
			
			}
			
	return c;
		}
		
}
