package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayTesting {

	public static void main(String[] args) {

		int capacity = 100;
		List <Object> myList = new ArrayList<>(capacity);
		List <String> myList1 = new LinkedList<>();
	
		myList.add("Hello");
		myList.add(123);
		myList.add('c');
		
		int [] myArray = new int [4];
		myArray[0] = 2;
		myArray[1] = 5;
		myArray[2] = 5;
		myArray[3] = 11;
		
		System.out.println(Arrays.asList(twoSum(myArray, 10)));

		

	}
	
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
	        
	        return resultingArray;

	 }
}
