package Problems;

import java.util.Arrays;

public class SortingBuiltInMethods {

	public static void main(String[] args) {
		
		//sorting - > default is ascending order
		
		// numbers
		int[] numbers= {40,60,50,10,30,20,70,80,90};
		
		System.out.println("Before sorting : "+Arrays.toString(numbers));
		
		Arrays.sort(numbers);
		
		System.out.println("After sorting Array : "+Arrays.toString(numbers));
		
		
		//char -> ASCII value A=65, a=97
		char c[]= {'z','a','A','Z','B','b'};
		System.out.println("Before sorting : "+Arrays.toString(c));
		Arrays.sort(c);
		System.out.println("After sorting : "+Arrays.toString(c));
		
		char z='A';
		System.out.println(z+0); //65
		char y='a';
		System.out.println(y+0); //97
		
		
		//String 
		String s[] = {"abhi","Arun","Aniruddh","bharat","Bhuvan"};
		System.out.println("Before sorting : "+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("After sorting : "+Arrays.toString(s));
		
		/*
		 first it will sort on first character of each String, if first characters same, then next
		 it will compare 2nd character in string
		 Aniruddh, Arun -> first character - A , wont compare
		 				-> second character - n and r -> compare
		 */
	}
}
