package strings;

import java.util.Arrays;

public class ArraysToString {

	public static void main(String[] args) {
	
		String []s= {"a","word","testig"};
		System.out.println(Arrays.toString(s));
		
		String str=String.join(" ",s);
		System.out.println(str);
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length;i++)
		{
			
			sb.append(s[i]);
			sb.append(" ");
		}
		System.out.println(sb);
		
		for(String s1:s)
		{
			System.out.print(s1+" ");
		}
	}

}
