package InterviewPractice;

public class oneto100primesum {
	public static boolean IsPrime(int num)
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
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i<=100; i++) {
			if (IsPrime(i)) {
				sum+=i;
				System.out.print(i+" ");
			}
		}
		System.out.println(sum);
	}
}
