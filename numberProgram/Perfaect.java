package numberProgram;

public class Perfaect {
	public static void main(String[] args) {
		int num=19;
		int sum=0;
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				sum+=i;
			}
		}
		String res =(num==sum)?"Prefect":"Not Perfect";
		System.out.println(res);
	}
}
