package Problems;

public class MaxAndMinNumber {

	public static void main(String[] args) {
		
		int[] a= {50,20,40,60,80};
		int max=0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Max number : "+max);
		
		
		//another way considering first element as max
		int maximum=a[0];
		//since i should start from 1, cause a[0] is considered max
		for(int i=1; i<a.length; i++) { 
			if(a[i]>maximum) {
				maximum=a[i];
			}
		}
		System.out.println("Maximum number : "+maximum);
	}
	// same procedure for minimum number
}
