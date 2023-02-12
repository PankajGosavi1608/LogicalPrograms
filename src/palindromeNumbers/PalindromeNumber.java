package palindromeNumbers;

import java.util.Scanner;

public class PalindromeNumber {
	 public static void main(String[] args) {
			
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the Number:");
		 
		 int num=sc.nextInt();//1234.
		 int org_num=num;
		 
		 //1. Using Algorithm 
		 
		 int rev=0;
		 while (num!=0) 
		 {
			 rev=rev*10 +num%10;
			 num=num/10;	 
		 }
		 if (org_num==rev)
		 { System.out.println(+org_num+"  is Palindrome Number");
		 }
		 else
		 {System.out.println(+org_num+"  is Palindrome Number");
		 }
		

}}
