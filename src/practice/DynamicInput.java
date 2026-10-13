package practice;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Integer array");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter value in index position :"+i);
			
		    a[i]=sc.nextInt();
		}
		
		System.out.println("Before sorting :"+Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After sorting :"+Arrays.toString(a));
		
		
	}
}
