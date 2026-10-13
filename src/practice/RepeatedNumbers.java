package practice;

public class RepeatedNumbers {

	public static void main(String[] args) {
		
		
		int num=10;
		int count = 0;
		
		int a[]= {45,10,77,65,10,20,10,10}; // Elements-8, Max index-7
		System.out.println("Total elements :"+a.length);
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==num)
			{
				count=count+1;  // count++
			}
		}
		System.out.println("Total number of times 10 repeated :"+count);
	}
}
