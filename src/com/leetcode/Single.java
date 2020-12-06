package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Single {

  public static void main(String[] args) {
    int[] test = {1, 4, 4};
    System.out.println(singleNumber2(test));
  }

  private static int singleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
      result = result ^ num;
    }

    return result;
  }

  private static int singleNumber1(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          nums[i] = -1;
          nums[j] = -1;
        }
      }
    }

    for (int num : nums) {
      if (num != -1)
        return num;
    }

    return 0;
  }

  private static int singleNumber2(int[] nums) {

    Map<Integer, Integer> results = new HashMap<>();

    for (int num : nums) {
      results.put(num, results.getOrDefault(num, 1));
    }

    for (int key : results.keySet()) {
      if (results.get(key) == 1) {
        return key;
      }
    }
    return 0;
  }

}
