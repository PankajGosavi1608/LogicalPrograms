package arraySum;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9}; //n=9   n-1=8
		
		int sum=0;
		
		//1. Simple For Loop For Array Sum
		
//		for(int i=0;i<=a.length-1;i++) 
//		{
//			sum=sum + a[i];
//		}
		
		//2. Enhanced For Loop for sum of Array elements 
		
		for (int value:a)
		{
			sum=sum+value;
		}
			System.out.println("Sum of Array is: "+sum);
		
	}

}
