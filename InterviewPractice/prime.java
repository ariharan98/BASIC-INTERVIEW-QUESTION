package InterviewPractice;

import java.util.*;

public class prime {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if (isPrime(num)) {
			System.out.println("Its a prime");
		}
		else
			System.out.println("Not a prime");
	}
	
public static boolean isPrime(int num)
{
	if (num==1||num==0) {
		return false;
	}
	else
	{
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}
}
}
