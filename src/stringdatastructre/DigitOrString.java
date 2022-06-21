package stringdatastructre;

public class DigitOrString {

	public static void main(String[] args) {

		String s = "11221";
		boolean flag = true;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)) == false) {
				flag = false;
				break;
			}

		}

		if (flag) {
			System.out.println(s + " is digit");
		} else {
			System.out.println(s + " is string");
		}

	}

}
