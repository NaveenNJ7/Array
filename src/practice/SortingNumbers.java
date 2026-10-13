package practice;

import java.util.Arrays;

public class SortingNumbers {
	
	public static void main(String[] args) {
		
		int a[] = {65,75,89,14,25,34,10,32};
		System.out.println("Length of an array :"+a.length);
		
		// printing array without for loop
		System.out.println(Arrays.toString(a));
		
		// sorting will be in Ascending order by default
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
	}

}
