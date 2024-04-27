package numberProgram;

public class Prime {
	public static void main(String[] args) {
		String res =(IsPrime(3))?"Prime":"Not a Prime";
		System.out.println(res);
	}
	
	public static boolean IsPrime(int num) {
		if (num==1||num==0) {
		return false;
		}
		else {
			for (int i = 2; i < num; i++) {
				if (num%i==0) {
					return false;
				}
			}
			return true;
		}
	}
}
