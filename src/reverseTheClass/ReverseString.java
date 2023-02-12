package reverseTheClass;

public class ReverseString {

	public static void main(String[] args) {
		
		//1. Using String Concatenation Operator
		
		String str="PANKAJ";
		String rev="";
		
		/*int len=str.length();//6
		
		for (int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse Name is: " +rev);*/
					
		//2. Using Character Array
		
//		char a[]=str.toCharArray();
//	    int len=a.length;
//	    
//	    for (int i=len-1;i>=0;i--) {
//	    	rev=rev+a[i];
//	    }
//	    	
//	    System.out.println("Reverse Name is: " +rev);
		
		//3. Using StringBuffer 
		

		 StringBuffer sb= new StringBuffer(str);
		 System.out.println(sb.reverse());
}

}
