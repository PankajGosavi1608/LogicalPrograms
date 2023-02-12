package arraySum;

import java.util.HashSet;

public class DuplicateInArray {
	
	public static void main(String[] args) {
		
		String arr[]= {"Java","C","C++","Python","Java"};
		
		// Approach 1
		
		
		boolean flag =false;
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==arr[j]) 
				{
					System.out.println("Found Duplicate Element: "+arr[i]);
					flag=true;
				}
			}
		}
		
		if (flag==false) 
		{
			System.out.println("Duplicate Element Not Found in Array");
		}
		
		// Approach 2 Using HashSet
		
	    HashSet <String> langs=new HashSet();
	    boolean flag1=false;
	    
	    for (String l:arr) 
	    {
	    	if (langs.add(l)==false)
	    	{
	    		System.out.println("Found Duplicate Element : "+ l);
	    		flag1=true;
	    	}
	    }
	    
	    if (flag1==false) 
	    {
	    	System.out.println("Duplicate Element Not Found in Array");
	    }
		
		
	}
}
