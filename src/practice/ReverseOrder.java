package practice;

import java.util.Arrays;

public class ReverseOrder {

	public static void main(String[] args) {
		

		char c[] = {'n','a','v','i','n'}; //elm-5, index-4
		System.out.println("Before sorting :"+Arrays.toString(c));
		System.out.println("Length of an array :"+c.length);
		
		System.out.println("Reverese direction order");
		for(int i=c.length-1; i>=0; i--)
		{
			System.out.print(c[i]+" ");
		}
		
		System.out.println();
		
		Arrays.sort(c);
		
		System.out.println("After sorting :"+Arrays.toString(c));  
	}

}
