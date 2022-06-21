package stringdatastructre;

public class RoundOfDigit {

	public static void main(String[] args) {


		int n=1200;
		
		int a=(n/10)*10;
		int b=a+10;
		int c=n-a;
		int d=b-n;
		
			if(c >d)
				System.out.println(b);
			else
				System.out.println(a);

	}

}
