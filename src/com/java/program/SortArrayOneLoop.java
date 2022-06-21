package com.java.program;

public class SortArrayOneLoop {

	public static void main(String[] args) {
	
		int a[]= {1,0,4,2,5,3,10};
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}
		for(int j:a)
		{
			System.out.println(j);
		}

	}

}
