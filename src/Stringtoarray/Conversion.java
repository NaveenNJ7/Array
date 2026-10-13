package Stringtoarray;

public class Conversion {

	public static void main(String[] args) {
		
		
		String s = "Mechanical";
		
		char[] c = s.toCharArray();
		
		System.out.println(s);
		
		System.out.println("String to array");
		
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		
		System.out.println("Reverse direction");
		for(int i=c.length-1; i>=0; i--)
		{
			System.out.println(c[i]);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
