package numberProgram;

public class NumPalidrom {
	public static void main(String[] args) {
		 int num=123321;
		 int rev=0;
		 int temp=num;
		 while (num>0) {
			rev=(rev*10)+num%10;
			num/=10;
		}
		 System.out.println(rev);
		 String res =(temp==rev)?"Its A Palindrome":"Not a Palidrome";
		 System.out.println(res);
	}
}
