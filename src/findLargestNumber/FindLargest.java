package findLargestNumber;

import java.util.Scanner;

public class FindLargest {

public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter First Number");
		
		int a=sc.nextInt();
		
        System.out.println("Enter Second Number");
		
		int b=sc.nextInt();
		
        System.out.println("Enter Third Number");
		
		int c=sc.nextInt();
		
		//Ternary Operator 1st way
//		int largest=a>b?a:b;                 // largest of a and b 
//			largest=c>largest?c:largest;     // largest of c and a b
		
		//Ternary Operator 2nd way
			int largest=c>(a>b?a:b)?c:(a>b?a:b);     // largest of c and a b
			System.out.println(largest+" : is the Largest value");
			
			
			
}}