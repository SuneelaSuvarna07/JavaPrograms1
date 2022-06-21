package stringdatastructre;

import java.util.Arrays;

public class SortStrinng {

	static final int MAX_CHAR = 26;
	
	
	public static void main(String[] args) {
		

		String s="dasdasz";
		System.out.println(s);
		sortStringAsc(s);
		sortString2(s);
		sortStringDesc(s);
		
		
		
}
	
	
	public static void sortStringAsc(String s)
	{
		int a[]=new int[MAX_CHAR];
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			int index=c-'a';
			a[index]++;
		}
		System.out.println(Arrays.toString(a));
		
		
		for(int i=0;i<MAX_CHAR;i++)
		{
			for(int j=0;j<a[i];j++)
			{
			
				int index=i+'a';
				char c=(char) index;
				System.out.print(c);
			}
		}
		System.out.println("");
		
		
	}
	public static void sortString2(String s)
	{
		
		System.out.println(s);
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length-1;i++)
		{
			if(c[i]<c[i+1])
			{
				char temp=c[i];
				c[i]=c[i+1];
				c[i+1]=temp;
				i=-1;
			}
				
				
		}
		
		for(char a:c)
		{
			System.out.print(a);
		}
		
		System.out.println("");
	}
	public static void sortStringDesc(String s)
	{
		int a[]=new int[MAX_CHAR];
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			int index=c-'a';
			a[index]++;
		}
		System.out.println(Arrays.toString(a));
		
		
		for(int i=MAX_CHAR-1;i>=0;i--)
		{
			for(int j=0;j<a[i];j++)
			{
			
				int index=i+'a';
				char c=(char) index;
				System.out.print(c);
			}
		}
		System.out.println("");
		
		
	}
	

}
