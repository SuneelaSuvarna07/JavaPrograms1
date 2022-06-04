package strings;

public class SwapStrings {

	public static void main(String[] args) {
 
        String firstString = "one";
        String secondString = "two";
 
        System.out.println("Before swapping....");
        System.out.println("The first String  = " + firstString);
        System.out.println("The second String = " + secondString);
 
        firstString = firstString + secondString; // step 1
        System.out.println(firstString.length());
        System.out.println(secondString.length());
       
        secondString = firstString.substring(0, (firstString.length() - secondString.length())); // step 2
        firstString = firstString.substring(secondString.length()); // step 3
 
        System.out.println("\nAfter swapping....");
        System.out.println("The first String  = " + firstString);
        System.out.println("The second String = " + secondString);
        
        
        String s1="suneela";
        String s2="suvarnaa";
        System.out.println(s1.length());
        System.out.println(s2.length());
         s1=s1+s2;
         System.out.println(s1);
         s2=s1.substring(0,s1.length()-s2.length());
         System.out.println(s2);
         s1=s1.substring(s2.length());
         System.out.println(s1);
         
 
    }

}