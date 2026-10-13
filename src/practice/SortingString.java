package practice;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		
		String s[] = {"America","Newzeland","Australia","Europe","UnitedKingdom"};
		System.out.println(Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println(Arrays.toString(s));
	}
}
