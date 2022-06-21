package stringdatastructre;

public class SortString {
	
	static final int MAX_CHAR = 26;

	public static void main(String[] args) {
		
		sortString("geeksforgeeks");
		
	}
	
		static void sortString(String str) {
			 
	        // Hash array to keep count of characters.

			int letters[] = new int[MAX_CHAR];
			
			//{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} 26 
	 
	        // Traverse string and increment
	        // count of characters
			
			for(int i=0;i<str.length();i++)
			{
				char character=str.charAt(i);
				
				int j=character-'a'; 
				letters[j]++;
			}
			
			for(int i=0;i<MAX_CHAR;i++)
			{
				for(int j=0;j<letters[i];j++)
				{
					int index=i+'a';  
					//System.out.println(index);
					char c=(char) index;
					System.out.print(c);
				}
			}
			System.out.println("");
			
			 /*        
	        for(int i=0;i<str.length();i++)
	        {
	        	char character=str.charAt(i);
	        	int j=character-'a';
	        	
	        	letters[j]++;
	        }
	    
	        for (char x : str.toCharArray()) {
	       	 
	            // 'a'-'a' will be 0, 'b'-'a' will be 1,
	            // so for location of character in count
	            // array we will do str[i]-'a'.
	            letters[x - 'a']++;
	        }
	 */
	        // Traverse the hash array and print
	        // characters
	        for (int i = 0; i < MAX_CHAR; i++) {
	            for (int j = 0; j < letters[i]; j++) {
	            	int temp=i+'a';
	            	char temp1=(char) temp;
	                System.out.print((char) (i + 'a'));
	            }
	        }
	    }
	

}
