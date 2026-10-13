package practice;

public class Heterogeneous {

	public static void main(String[] args) {
		
		// we can store heterogeneous elements in array using Object class
		Object a[] = {10,"Obj",20.5,'A',true};
		
		System.out.println("Length of array :"+a.length); //5
		System.out.println(a[3]); //A
		
		for(int b=0; b<=a.length-1; b++)
		{
			System.out.print(a[b]+" ");
		}
		
		
	}
}
