package InterviewPractice;

public class removespacesinstr {
	public static void main(String[] args) {
		String str = "Ari haran";
		String rem="";
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)!=' ') {
				rem +=str.charAt(i);
			}
		}
		System.out.println(rem);
	}
}
