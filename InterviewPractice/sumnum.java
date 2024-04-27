package InterviewPractice;

/*
 input : Arih3a3r2an
 output : 8*/

public class sumnum {
	public static void main(String[] args) {
		String str = "Arih3a3r2an";
		int sum=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)>='0'&&str.charAt(i)<='9') {
				sum+=str.charAt(i)-48;
			}
		}
		System.out.println(sum);
	}
	
}
