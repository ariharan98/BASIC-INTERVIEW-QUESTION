package InterviewPractice;

import java.util.Arrays;

public class NameAlphebet {
	public static void main(String[] args) {
		String str ="ariharan";
		char [] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]>ch[j]) {
					char temp =ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ch));
	}
}
