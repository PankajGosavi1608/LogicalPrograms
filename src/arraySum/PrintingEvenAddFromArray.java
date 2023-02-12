package arraySum;

public class PrintingEvenAddFromArray {

public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		//1. Extracting Even Numbers Using Simple For Loop
		
 	//System.out.println("Even Number From Array: ");
//		for (int i=0;i<a.length;i++) 
//		{
//			if (a[i]%2==0)
//			System.out.println(a[i]);
//		}
//		System.out.println("Odd Number From Array: ");
//		for (int i=0;i<a.length;i++) 
//		{
//			if (a[i]%2!=0)
//			System.out.println(a[i]);
//		}
		
		//1. Extracting Even Numbers Using Enhanced For Loop
		System.out.println("Even Number From Array Using Enhanced Loop: ");
		
    	for (int value:a) 
    		{
    			if (value%2==0)
    			System.out.println(value);
   		    }
    	
    	System.out.println("Odd Number From Array Using Enhanced Loop: ");
    	for (int value:a) 
		{
			if (value%2!=0)
			System.out.println(value);
		    }
    			
    			
    			
    			
    			
}}
