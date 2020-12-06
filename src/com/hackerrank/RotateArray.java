package com.hackerrank;

import java.util.Arrays;

public class RotateArray {

  public static void main(String[] args) {

    int[] array = {1, 2, 3, 4, 5};
    rotLeft(array, 10).toString();

  }

  static int[] rotLeft(int[] array, int rotations) {

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ", ");
    }
    for (int i = 0; i < rotations; i++) {

      int temp = array[0];
      int helper = 0;

      for (int j = 1; j < array.length; j++) {
        array[helper++] = array[j];
      }

      helper = 0;
      array[array.length - 1] = temp;
    }
    System.out.println();

    return array;
  }


}
