package arraySum;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {1,2,3,4,5,6,7,8,10};
		
		// Approach 1
		
//		boolean status=Arrays.equals(a,b);
//		
//		if (status==true)
//		{
//			System.out.println("Arrays are Equal");
//		}
//		else
//		{
//			System.out.println("Arrays are Not Equal");
//		}
		
		//2. Approach
		
		boolean status=true;
		
		if (a.length==b.length)
		{
			for (int i=0;i<a.length;i++) {
				if (a[i])!=b[i])
                 {
	              status=false;
                 }
			}
		}
		
		else
		{
			status=false;
		}
		if (status==true)
		{
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		

		
	}
}
