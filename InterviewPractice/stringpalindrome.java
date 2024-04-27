package InterviewPractice;

public class stringpalindrome {
	public static void main(String[] args) {
		String str ="RaceCar";
		String rev ="";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i)+rev;
		}
		String res =(str.equalsIgnoreCase(rev))?"Its a Palindrome":"Not a Palindrome";
		System.out.println(res);
	}
}
