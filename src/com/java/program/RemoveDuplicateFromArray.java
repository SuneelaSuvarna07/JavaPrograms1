package com.java.program;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
	
		int a[]= {4,5,2,5,2,4,1,4,2,7,8,1};
		
		ArrayList<Integer>list=new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if (!list.contains(a[i]))
			{
				
				list.add(a[i]);
				k++;
			
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]+"-----"+k);
				
			}
		//	System.out.println(list.get(i)+"-----"+k);
			
	}
	


}
}