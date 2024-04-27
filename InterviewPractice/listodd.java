package InterviewPractice;

import java.util.*;

public class listodd {
	public static void main(String[] args) {
		List list = new ArrayList(Arrays.asList(23,1,3,5,9));
		if (oddList(list)) {
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	
	

	public static boolean oddList(List<Integer> list)
	{
		for(int el:list)
		{
			if (el%2==0) {
				return false;
			}
		}
		return true;
	}
}
