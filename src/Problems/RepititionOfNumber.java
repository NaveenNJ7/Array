package Problems;

public class RepititionOfNumber {

	public static void main(String[] args) {
		
		//searching an element how many times occurs in array or duplicates
		
		int[] n= {20,30,10,40,20,10,30,50,20,10,70,30,20,40};
		int d=10;
		int count=0;
		
		for(int i=0; i<n.length; i++) {
			
			if(n[i]==d) {
				 count++;// or count=count+1;
			}
		}
		System.out.println("Number of times occurs : "+count);
	}
	
}
