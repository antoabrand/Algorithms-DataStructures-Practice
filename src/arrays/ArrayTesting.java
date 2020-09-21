package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayTesting {

  public static void main(String[] args) {

    int[] arr = {5, 4, 3, 2, 1};

    swaps(arr, 1);

    for (int i : arr) {
      System.out.println(i);
    }

  }

  public static int[] twoSum(int[] nums, int target) {
    int[] resultingArray = new int[2];
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int j = 1; j < nums.length; j++) {
        sum = nums[i] + nums[j];
        if (sum == target && i != j) {
          resultingArray[0] = i;
          resultingArray[1] = j;
          return resultingArray;
        }
      }
    }

    return resultingArray;

  }

  public static void swaps(int[] arr, int swaps) {

    int i = 0;

    while (i < swaps) {
      int temp = arr[0];

      for (int j = 1; j < arr.length; j++) {
        arr[j - 1] = arr[j];
      }
      arr[arr.length - 1] = temp;
      i++;
    }
  }
}
