package strings;

public class LenghtOfAraay {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,4,5};
		int count=0;
		System.out.println(a.length);
		for(int i:a)
		{
			count++;
		}
		System.out.println(count);
		
		String s="adaasdas";
		System.out.println(s.length());
		int count1=0;
		for(char c: s.toCharArray())
		{
			count1++;
		}
		System.out.println(count1);
	}

}
