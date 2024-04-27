package InterviewPractice;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String a= "care";
		String b="race";
		char [] ch1=a.toCharArray();
		char [] ch2=b.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String res = "Anagram";
		if (ch1.length!=ch2.length) {
			res="Not A Anagram";
		}
		else {
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i]!=ch2[i]) {
					res="Not A Anagram";
				}
			}
		}
		System.out.println(res);
	}
	
}
