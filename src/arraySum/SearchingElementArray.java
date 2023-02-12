package arraySum; 

public class SearchingElementArray { //Linear Search
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,30};
		
		int search_ele=50;
		boolean flag=false;
		for (int i=0;i<a.length;i++)
		{
			if (search_ele==a[i])
			{
			System.out.println("Duplicate Element at: " +i+ " no in Array Row");
			flag=true;
			break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Duplicate Not Found");
		}
		
	}

}
