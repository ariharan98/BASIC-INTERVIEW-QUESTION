package InterviewPractice;

import java.util.Arrays;
import java.util.Iterator;

public class ArrMerge {
	public static void main(String[] args) {
		int a[] = {1,2,3};
		int b[] = {2,4,6};
		int c[] = new int [a.length+b.length];
		for (int i = 0,m=0,n=0; i < c.length; i++) {
			if (m<a.length) {
				c[i]=a[m++];
			}
			else if (n<b.length) {
				c[i]=b[n++];
			}
		}
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
//		for (int i = 0; i < c.length; i++) {
//			for (int j = i+1; j < c.length; j++) {
//				if (c[i]>c[j]) {
//					int temp=c[i];
//					c[i]= c[j];
//					c[j]=temp;
//					}
//			}
//		}
//		
		System.out.println(Arrays.toString(c));
	}
	

}
