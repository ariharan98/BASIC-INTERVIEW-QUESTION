package InterviewPractice;

import java.util.Arrays;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 8, 5, 3, 4, 7, 8, 5, 3, 2, 5 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int[] b = new int[arr.length];
		int j = 0;
		for (int i = 0; i < b.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				b[j] = arr[i];
				j++;
			}
		}
		b[j] = arr[arr.length - 1];
		j++;
		System.out.println(Arrays.toString(b));
		int[] res = new int[j];
		for (int i = 0; i < res.length; i++) {
			res[i] += b[i];
		}
		System.out.println(Arrays.toString(res));
	}
}
