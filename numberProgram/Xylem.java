package numberProgram;

public class Xylem {
	public static void main(String[] args) {
		int num=312314;
		int last=num%10;
		num=num/10;
		int msum=0;
		while (num>9) {
			msum+=num%10;
			num/=10;
		}
		System.out.println(num+last);
		System.out.println(msum);
		String res=((last+num)==msum)?"Xylem":"Pholem";
		System.out.println(res);
	}
	
}
