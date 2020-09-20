package project.euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 
 * 	A palindromic number reads the same both ways. 
 * 	The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 	Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 */
public class LargestPalindromeProduct {

	static List<Long> listOfPalindromes = new ArrayList<>();
	public static void main(String[] args) {
		
		
		
		
		
		String test = new String("someword");
		String test2 = new String("omeword");
		System.out.println(test.charAt(0));
		System.out.println(test2.charAt(0));
		Character capTest = test.charAt(0);

		String whh = test.replace(test.charAt(0), Character.toUpperCase(capTest));
		
		System.out.println(whh);
		
		long startTime = System.nanoTime();
	
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				if (getProduct(i, j) != -1) {
					listOfPalindromes.add(getProduct(i, j));
				}
			}
		}
		
		System.out.println(getLargestNum(listOfPalindromes));
		long endTime = System.nanoTime();
		
		long duration =  endTime - startTime; 
		double inMili = (double) (duration/1000000);
		double inSeconds = inMili/1000;
		System.out.println("Total Time: "+ inSeconds);
	}
	
	public static Long getProduct(int firstNum, int secondNum) {

		Long product = (long)firstNum * (long)secondNum;
		if (isPalindrome(product)) {
			return product;
		}
		return -1L;
	}
	
	public static Long getLargestNum(List<Long> listOfPalindromes){

		Long largestNum = 0L;

		for(Long n : listOfPalindromes){
		    if(n > largestNum) largestNum = n; 
		}

		return largestNum; 

	}

	private static boolean isPalindrome(Long num) {
		String[] numArray = num.toString().split("");
		int index = numArray.length - 1;
		for (String n : numArray) {
			if (!n.equals(numArray[index--])) {
				return false;
			}
		}
		return true;
	}
	


}
