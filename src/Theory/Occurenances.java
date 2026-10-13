package Theory;

public class Occurenances {

	
	public static void main(String[] args) {
		
		int[] numbers = {4,5,6,4,3,7,8,4,5,3,4,7,8,};
		
		int count = 0;
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]==4)
			{
				System.out.println(numbers[i]);
				count++;
			}
			
		}
		System.out.println("Total number of occurances");
		System.out.println(count);
	}
	
	
	
	
	
	
	
	
	
	
}
