package stringdatastructre;

public class StringRotation {

	public static void main(String[] args) {

		
		
		String s = "abc";
		rotateString(s);
		countRotateString(s);
		System.out.println("");
		rotateString1(s);
	}
	
	public static void rotateString(String s)
	{
		String sb = s.concat(s);
		int count=0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				int n = i + j;
				char c = sb.charAt(n);
				System.out.print(c);
				
			}
			System.out.println("");
		}
	}
	
	public static void countRotateString(String s)
	{
		String temp=s+s;
		for(int i=1;i<=s.length();i++)
		{
			String sub=temp.substring(i,i+s.length()); //bca cab //abc
			
			if(sub.equals(s))
			{
				System.out.println(i);
			}
		}
	}
	
	public static void rotateString1(String s)
	{
		
		String temp=s+s;
		for(int i=0;i<s.length();i++)
		{
			String sub=temp.substring(i,i+s.length()); 
			
			System.out.println(sub);
			
		}
	}
}

//abcabc - rotation
//abc
//bca
//cab