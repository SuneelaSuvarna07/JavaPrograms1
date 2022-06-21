package stringdatastructre;

public class AllCharactersSame {

	public static void main(String[] args) {
		
		String  s="abc";
		
		boolean flag=true;
		
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)!=s.charAt(0))
			{
				flag=false;
			}
			
		}

		if(flag)
		{
			System.out.println(s+" characters are  same");
		}
		else
		{
			System.out.println(s+" characters are not same");
		}
	}

}
