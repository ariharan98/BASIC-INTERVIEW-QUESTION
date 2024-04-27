package InterviewPractice;

/*
 input : a3b2c3a2
 output : aaabbcccaa*/

public class sumnum1 {
	public static void main(String[] args) {
		String str="a3b2c3a2";
		String ans="";
		char [] ch =str.toCharArray();
		for (int i = 1; i <= ch.length; i+=2) {
			for (int j = 1; j <= ch[i]-48; j++) {
				ans+=ch[i-1];
			}
		}
		System.out.println(ans);
	}

}
