package Theory;

public class Demo {

	public static void main(String[] args)
	{
		// Declaration- datatype[] arrayname;
		
		int[] a;
		
		// creation - arrayname = new datatype[size];
		a = new int[3];
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("------");
		// initialization - arrayname[index]=value;
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		// array initialization directly - datatype[] arrayname = {v1, v2,v3,v4...vn};
		
		System.out.println("-------");
		
		int[] b = {30,40,50};
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
	}
	
}
