package Problems;

public class MissingNumber {
/*
 To find missing number in an Array
 Array should not have duplicates
 Array elements if they are in sorted okay if not in sorted oreder also okay
 Array element should be in specific range
 */
	
	public static void main(String[] args) {
		
		int a[]= {1,3,5,4};
		int sum1=0;
		
		for(int i=0; i<a.length; i++) {
			sum1=sum1+a[i]; 
		}
		System.out.println("Sum of elements in Array : "+sum1);
		
		int sum2=0;
		for(int i=0; i<=5; i++) {
			sum2=sum2+i; 
		}
		System.out.println("Sum of numbers in range : "+sum2);
		
		int missing=sum2-sum1;
		System.out.println("Missing number : "+missing);
		
	}
}
