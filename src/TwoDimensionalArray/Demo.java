package TwoDimensionalArray;

public class Demo {

	public static void main(String[] args) {
		
		
		//declaration and creation
		int a[][] = new int[3][2];
		
		// both columns and rows index position starts from 0
		
		
		// initialization row 0
		a[0][0]  =1;
		a[0][1] = 2;
		// row 1
		a[1][0] = 3;
		a[1][1] = 4;
		// row 2
		a[2][0] = 5;
		a[2][1] = 6;
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[2][0]);
		System.out.println(a[2][1]);
		
		// rows are 3 and columns are 2, when we print length it will consider row number not columns
		System.out.println("Lenght of array "+a.length);
	}
}
