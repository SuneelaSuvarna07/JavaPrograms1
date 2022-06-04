package com.java.program;

public class Zeta1 {

	private Zeta1(int [] d)
	{
		System.out.println("Double array");
		System.err.println(d);
	}
	
	private Zeta1(Object obj)
	{
		System.out.println("object");
		System.out.println(obj);
	}
	
	
	
	public static void main(String[] args) {
		double b[]= {1,2,3};
		double c[]=new double [] {1,2,3};
		double d[]=new double[1];
		d[0]=1;
		new Zeta1(b);
		
	}

}
