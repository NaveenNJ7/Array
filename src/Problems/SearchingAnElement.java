package Problems;

public class SearchingAnElement {

	public static void main(String[] args) {
		
		int a[]= {10,50,20,30,40,30};
		int x=20;  //try element not in array 100,70,60 etc
		boolean status=false;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==x)
			{
				System.out.println("Element found : "+a[i]);
				status=true;
				break;
			}
		}
		if(status==false)
		{
		System.out.println("Element not found");
		}
		
	}
}
