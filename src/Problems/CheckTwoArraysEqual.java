package Problems;

import java.util.Arrays;

public class CheckTwoArraysEqual {

	public static void main(String[] args) {
		
	//while checking two arrays equals, they should have same length
		
		int a[] = {1,2,3,4};
		int b[] = {1,2,3,4};
		
		boolean status=true;
		
		if(a.length==b.length) {
			
			for(int i=0; i<a.length; i++) {
				
				if(a[i]!=b[i]) {
					status=false;
				}
				else {
					status=true;
				}
			}
		}
		else {
			status=false;
		}
		
		if(status==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays not equal");
		}
		
		//buitl in method
		
		boolean sts=Arrays.equals(a, b);
		
		if(sts==true) {
			System.out.println("Arrays are equals built in method");
		}
		else {
			System.out.println("Arrays are not equals built in method");
		}
		
		
	}
}
