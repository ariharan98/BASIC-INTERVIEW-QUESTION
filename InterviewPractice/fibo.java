package InterviewPractice;

public class fibo {
	public static void main(String[] args) {
		int num1 =0,num2=1,num3=0,count=10;
		for(int i=0;i<count;i++)
		{
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
			num3=num1+num2;
		}
	}

}
