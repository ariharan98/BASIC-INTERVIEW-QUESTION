package InterviewPractice;
import java.util.*;

public class vowelconsonant {
	public static void main(String[] args) {
		Scanner Ari = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char user_ip =Ari.next().charAt(0);
		switch(user_ip) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Its a Vovel");
			break;
		default:
			System.out.println("Its a Consonant");
		}
				
//		char [] ch = {'A','E','I','O','U','a','e','i','o','u'};
//		System.out.print("Enter the character: ");
//		char user_ip =Ari.next().charAt(0);
//		for (char c : ch) {
//			if (user_ip==c) 
//				System.out.println(user_ip+" Its a Vowel");
//				
//		} 
		
	}
}
