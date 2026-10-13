package practice;

public class TwoDimensional {

	
	public static void main(String[] args) {
		
		// approach fixed size
		
	/*	int a[][] = new int[2][2];
		
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;  */
		
		
		// dynamic approach
		int a[][]= {{10,20},   //1st row has 2 coloumns but index is 0
				    {30,40},   // 2nd row   "                 " 1
				    {50,60}    // 3rd row   " 				  " 2	
				   };
		
		     
		     System.out.println("Row 1st data :"+a[0][0]); // 10
		     System.out.println("Row 3rd but index 2 data :"+a[2][1]); //60
		     
		     //size of an array gives  total Number of rows 
		     System.out.println("Length of array :"+a.length); // 3 
		     
		     // size of column for particular row
		     System.out.println("Length of column for particular 2ndrow :"+a[2].length); //2
		     System.out.println("Length of column for particular 1strow :"+a[1].length);
		     
		     // Total elements in array
		     System.out.println("Total elements in array a[][]");
		     // outer loop for row
		     for(int r=0; r<a.length; r++)
		     {
		    	 //inner loop for column
		    	 for(int c=0; c<a[r].length; c++)
		    	 {
		    		 System.out.print(a[r][c]+" ");
		    	 }
		    	 System.out.println();
		     }
		
		     int b[][] = {
		    		      {5,15},
		    		 	  {25,35},
		    		      {45,55}
		    		 	 };
		     
		     System.out.println("Total elements in array b[][]");
		     for(int d[]: b)
		     {
		    	 for(int element: d)
		    	 {
		    		 System.out.print(element+" ");
		    	 }
		    	System.out.println("");
		     }
		     
		     
		     
		
	}
}
