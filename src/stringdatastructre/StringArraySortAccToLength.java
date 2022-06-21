package stringdatastructre;

public class StringArraySortAccToLength {

	public static void main(String[] args) {
		String s[]= {"abasdsa","AS","sa","a","asdas"};
		
		for(int i=0;i<s.length-1;i++)
		{
				
				if(s[i].length()<s[i+1].length())
				{
					String temp="";
					temp=s[i];
					s[i]=s[i+1];
					s[i+1]=temp;
					i=-1;
				
			}
		}
		
		for(String s1:s)
		{
			System.out.print (s1+" ");
		}

	}

}
