package practice;

public class SearchingAnElement {

	public static void main(String[] args) {
		
		//only searching not duplicate values
		int num=9;
		boolean status = false;
		
		int a[] = {10,6,8,7,5,9,7}; // Elements-7, Max Index-6
		System.out.println("Length of array :"+a.length);
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==num)
			{
				System.out.println("Number found");
				status=true;
				break;
			}
		}
		
		if(status==false)
		{
			System.out.println("Number not found");
		}
		
	}
}
