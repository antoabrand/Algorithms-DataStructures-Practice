package com.code.leet;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		
		int [] myArray = new int [4];
		myArray[0] = 2;
		myArray[1] = 5;
		myArray[2] = 5;
		myArray[3] = 11;
		
		System.out.println(Arrays.toString(twoSum(myArray, 10)));

	}
	
	//brute force - O(n^2) time complexity - not scalable 
	 public static int[] twoSum(int[] nums, int target) {
	        int [] resultingArray = new int [2]; 
	        int sum = 0;
	        
	        for(int i = 0; i < nums.length; i++){
	            for(int j = 1; j < nums.length; j++){
	            	sum = nums[i] + nums[j];
	                if(sum == target && i != j){
	                    resultingArray[0] = i;
	                    resultingArray[1] = j;
	                    
	                    return resultingArray;  
	                    }
	                }
	            }
	        
	       throw new IllegalAccessError();

	 }
}
	 
	 //finding the complement with HashMap - O(n) -linear complexity - requires additional data structures - scalable
