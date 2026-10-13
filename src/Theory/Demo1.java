package Theory;

public class Demo1 {
	
	public static void main(String[] args) {
		
		// declaration and creation datatype[] arrayname = new datatype[size];
		
		int[] a = new int[3];
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("-----------");
		
		/*
		datatype[] arrayname;
		arrayname = new datatype[size];
		datatype[] arrayname = new datatype[size];
		arrayname[] = value;
		datatype[] arrayname = {v1,v2,v3...vn};
		
		 */
		
		 String[] name;
		 
		 name = new String[3];
		 
		 System.out.println(name[0]);
		 System.out.println(name[1]);
		 System.out.println(name[2]);
		 
		 System.out.println("-----------");
		 
		 name[0] = "Pradeep";
		 name[1] = "Guru";
		 name[2] = "Mayur";
		 
		 System.out.println(name[0]);
		 System.out.println(name[1]);
		 System.out.println(name[2]);
		 System.out.println("length of array "+name.length);
		 
		 System.out.println("--------");
		 
		 for(int i=0; i<name.length; i++)
		 {
			 System.out.println(name[i]);
		 }
		 
		 System.out.println("--------");
		 
		 for(int i=name.length-1; i>=0; i--)
		 {
			 System.out.println(name[i]);
		 }
		
		
		
		
		
		
		
		
		
		
	}

}
