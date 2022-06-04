package com.java.program;

public class MinMaxMultiDimenArray {

	public static void main(String[] args) {
		
		int a[][]= {{3,5,22},{10,1,4},{12,9,-1}};
		
		int min=a[0][0];
		int max=a[0][0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				
			}
		}
		
		System.out.println("Minimum value in two dimensional array is "+min);
		System.out.println("Maximum value in two dimensional array is "+max);

	}

}
