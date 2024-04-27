package InterviewPractice;

public class Panagram {

	public static void main(String[] args) {
		String str = "The Quick Brown Fox jumps over the lazy dog";
		str =str.toLowerCase();
		boolean panagram=true;
		for (int ch = 'a'; ch <='z'; ch++) {
			if (str.indexOf(ch)==-1) {
				panagram=false;
			}
		}
		String res=(panagram)?"The String is panagram":"The string is not a pangram";
		System.out.println(res);
	}
	

}
