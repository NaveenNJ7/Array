package Theory;

public class Sumofnumbers {

	
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,6,7,8,9,10};
		
		int sum=0;
		
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
			sum = sum+numbers[i];
		}
		
		System.out.println("sum of all numbers :"+sum);
		
		
		
		
		
		
		
		
	}
}
