package numberProgram;

public class Factorial {
	public static void main(String[] args) {
		int num =5;
		int fact=1;
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				System.out.println(i);
			}
		}
	}
}
