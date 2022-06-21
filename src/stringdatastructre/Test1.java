package stringdatastructre;

public class Test1 {

	public static void main(String[] args) {
		//input="hoW aRE YOu";
		//output="How Are You";
		
		String s="hoW aRE YOu";
		String s2="";
		String s1[]=s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			s2=s1[i].toLowerCase().substring(0,1).toUpperCase()+s1[i].toLowerCase().substring(1);
				
					System.out.println(s2);
			 
		}
		
		String str = "java";
		String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
		
		for(int i=0;i<s1.length;i++)
		{
			int size=s1[i].length();
			char c[]=s1[i].toLowerCase().toCharArray();
			
			for(int j=0;j<size;i++)
			{
				
				c[0] = Character.toUpperCase(c[0]);
				
				break;
				
			}
			
		}
	

	}

}
