package TwoDimensionalArray;

public class Demo1 {

	public static void main(String[] args)
	{
		// both columns and rows index position starts from 0
		int a[][]= {{10,30,50},
				    {20,50,80},
				    {30,60,90},
				    {40,70,100}
				   };
		
		System.out.println(a[0][0]);  //10
		System.out.println(a[3][2]);  //100
		
		// rows are 3 and columns are 2, when we print length it will consider row number not columns
		System.out.println("length of array "+a.length);
		
		// to find columns specify the row number, 
		System.out.println("Number of columns in row 2 are "+a[1].length);
		
		System.out.println("Using for loop");
		
		for(int r=0; r<a.length; r++)
		{
			for(int c=0; c<a[r].length; c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println(" ");
		}
		
		
		
	}
}
