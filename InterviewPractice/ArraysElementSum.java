package InterviewPractice;

public class ArraysElementSum {
	public static void main(String[] args) {
		int [] arr = {1,4,5,3,2,8,9,3,10};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
