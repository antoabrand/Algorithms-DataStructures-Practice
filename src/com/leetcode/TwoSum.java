package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  // given an array - return the two indexes that contain the elements that when
  // summed equal the target value
  // cannot repeat the same index

  // eg. [2,5,5,11] with target 10, should return [1,2]
  public static void main(String[] args) {

    int[] myArray = new int[4];
    myArray[0] = 3;
    myArray[1] = 2;
    myArray[2] = 4;


    System.out.println(Arrays.toString(twoSum(myArray, 6)));
    System.out.println(Arrays.toString(twoSumOptimized(myArray, 6)));
  }

  // brute force - O(n^2) time complexity - not scalable
  public static int[] twoSum(int[] nums, int target) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 1; j < nums.length; j++) {
        sum = nums[i] + nums[j];
        if (sum == target && i != j) {
          int[] resultingArray = {i, j};
          return resultingArray;
        }
      }
    }

    throw new IllegalAccessError();

  }

  // finding the complement with HashMap - O(n) -linear complexity - requires
  // additional data structures - scalable

  public static int[] twoSumOptimized(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    int complement;

    for (int i = 0; i < nums.length; i++) {
      complement = target - nums[i];
      // don't need to check for duplicates as having values in hashMap ensures unique values
      if (map.containsKey(complement)) {
        int[] resultingArray = {map.get(complement), i};
        return resultingArray;
      }
      // where nums[] values are the keys and i is the position as a value to be returned
      map.put(nums[i], i);
    }

    throw new IllegalAccessError();

  }
}
