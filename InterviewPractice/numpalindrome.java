package InterviewPractice;

public class numpalindrome {
	public static void main(String[] args) {
		int num =123321,rev=0,temp=num;
		while(num>0)
		{
			rev=(rev*10)+num%10;
			num/=10;
		}
		String res =(rev == temp)?"Number is palindrome":"Not Palindrome";
		System.out.println(res);
	}
}
