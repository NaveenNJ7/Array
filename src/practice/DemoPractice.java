package practice;

public class DemoPractice {

	public static void main(String[] args) {
		
		
		// approach 1 declaring array 
		int a[] = new int[5];
		//5 is total number of elements
		 
		a[0]=15;
		a[1]=35;
		a[2]=25;
		a[3]=45;
		a[4]=55;
		
		// approach 2
		/*
		 Total number of elements 5 and maximum index position is n-1 
		 */
		int b[]= {100,300,200,400,500};
		System.out.println("Length of an array :"+b.length);
		System.out.println("index position of 3 :"+b[3]);
		
		// normal for loop
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		// for each loop or enhance for loop
		for(int x:b)
		{
			System.out.print(x+" ");
		}
		
	}
}
