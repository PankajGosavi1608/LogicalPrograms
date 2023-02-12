package randomNumberAndStrings;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		//1. Approach Random Number Generation
		
//		Random rand=new Random();
//		int rand_int=rand.nextInt(100);
//		System.out.println(rand_int);
//		
//		Double rand_dbl=rand.nextDouble(100);
//		System.out.println(rand_dbl);
		
		//Aproach 2 math
		
//        System.out.println(Math.random());
		
		//Aproach 3 Appache Commons-lang API
		// http://commons.apache.org/
		
		String randNum=RandomStringUtils.randomNumeric(10);
		System.out.println(randNum);
		
		String randStr=RandomStringUtils.randomAlphabetic(10);
		System.out.println(randStr);
		
	}

}
