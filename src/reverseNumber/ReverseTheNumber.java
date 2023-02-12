package reverseNumber;

import java.util.Scanner;

public class ReverseTheNumber {
	
	 public static void main(String[] args) {
		
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the Number:");
	 
	 int num=sc.nextInt();//1234
	 
	 //1. Using Algorithm 
	 
	 /*int rev=0;
	 while (num!=0) 
	 {
		 rev=rev*10 +num%10;
		 num=num/10;	 
	 }*/
	 //
	// System.out.println("Reverse Number is: " +rev);
	 
	 //2. StringBufferClass
	 
//	 StringBuffer sb= new StringBuffer(String.valueOf(num));
//	 StringBuffer rev= sb.reverse();
//	 
//	 System.out.println("Reverse Number is: " +rev);
//	 
	 
	 //3. StringBuilder Class
	 	
	 StringBuilder sbl=new StringBuilder();
	 sbl.append(num);
	 StringBuilder rev=sbl.reverse();
	 System.out.println("Reverse Number is: " +rev);
	 
	 }

}
