package strings;

import java.util.ArrayList;

public class MissingNumbwe {

	public static void main(String[] args) {
	
		int a[]= {1,3,5};
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
		}
		
		for(int i=1;i<10;i++)
		{
			if(!al.contains(i))
			{
				System.out.println(i);
			}
		}

	}

}
