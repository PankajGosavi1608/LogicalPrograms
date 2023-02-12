package swappingNumber;

public class Swapping2Number {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("Before swapping the numbers  " +a+"  "+b);
		
		//Logic 1- Using third variable
		
//		int t=a;
//		a=b;
//		b=t;
		
//		System.out.println("After swapping the numbers  " +a+"  "+b);
		
		// Logic 2- without using third Variable
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("After swapping the numbers  " +a+"  "+b);
		
//		Logic 3- Using Multiplication* and Division/
//		a and b should not be zero
		
//		a=a*b;
//     	b=a/b;
//	    a=a/b;
//	    System.out.println("After swapping the numbers  " +a+"  "+b);
		
		
//		Logic 4-Bitwise XOR Operator(^)
		
//		a=a^b;
//      b=a^b;
//      a=a^b;
//      System.out.println("After swapping the numbers  " +a+"  "+b);
		
//		LOgic 5- Single statement
		// a=10 b=20 current values
		
		b=a+b-(a=b);
	    System.out.println("After swapping the numbers  " +a+"  "+b);
	}
}
