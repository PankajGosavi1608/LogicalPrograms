package findFactorial;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Number: ");
		
		int num=sc.nextInt();
		long factorial=1;
		
		for(int i=1;i<=num;i++) // if num=5 then 5! = 1*2*3*4*5 = 120
		{
			factorial=factorial * i;
		}
			System.out.println("Factorial of Number is: "+factorial);
	}

}
