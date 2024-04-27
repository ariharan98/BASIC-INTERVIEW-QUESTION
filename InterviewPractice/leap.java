package InterviewPractice;

public class leap {
	public static void main(String[] args) {
		int year = 2024;
		String res =(year%4==0 && year%100!=0||year%400==0)? "Its a Leap Year":"Its Not a LeapYear";
		System.out.println(year+" "+res);
	}
}
