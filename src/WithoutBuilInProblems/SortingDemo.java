package WithoutBuilInProblems;

import java.util.Arrays;

public class SortingDemo {

	public static void main(String[] args) {
		
		int[] numbers= {40,20,30,10,50};
		
		//the number of passes should be passes=length-1
		
		for(int i=0; i<numbers.length-1; i++) {  //outer loop passes
			
			for(int j=0; j<numbers.length-1; j++) { // inner loop for comparison 
				
				if(numbers[j]>numbers[j+1]) {
					
					int dummy=numbers[j];		
//now storing num[0] into temporary variable dummy, num[0] becomes empty
					numbers[j]=numbers[j+1];
//now store j+1 int num[0] -> num[0] value becomes less, means swap					
					numbers[j+1]=dummy;
				}
			}
			
		}
		System.out.println(Arrays.toString(numbers)); //this is built in method
		
		for(int x:numbers) {    // without built method printing
			System.out.println(x);
		}
		
	}
}
