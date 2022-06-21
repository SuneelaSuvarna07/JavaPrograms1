package stringdatastructre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class SortWordOfArray  {

	public static void main(String[] args) {

		String s[] = { "zeadf", "tuewds", "dasa", "xxs", "axcaer" };
		
		compareStringNormal(s);
		System.out.println(" ");
		compareStringCollection(s);
		System.out.println(" ");
	
		Arrays.sort(s,Comparator.naturalOrder());
		System.out.println(Arrays.toString(s));

		
	}
	
	public static void compareStringNormal(String s[])
	{
		for (int i = 0; i < s.length - 1; i++) {
			if (s[i].compareTo(s[i + 1]) > 0) {
				String temp = s[i];
				s[i] = s[i + 1];
				s[i + 1] = temp;
				i = -1;

			}
		}

		for (String s1 : s) {
			System.out.print(s1 + " ");
		}
	}
	
	public static void compareStringCollection(String s[])
	{
		
		TreeSet<String>a=new TreeSet(new MyCompare());
		for(String s1:s)
		{
			a.add(s1);
			
		}
		
		for(String s2:a)
		{
			System.out.print(s2+" ");
		
	}

}
}

class MyCompare implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1=(String) o1;
		String s2=(String) o2;
		return s2.compareTo(s1);
	}
	
}
