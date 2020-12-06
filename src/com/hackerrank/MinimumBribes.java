package com.hackerrank;

import java.util.*;

public class MinimumBribes {

  public static void main(String[] args) {

    int[] myArray = {1, 2, 5, 3, 7, 8, 6, 4,};
    // 1, 2, 3, 4, 5, 6, 7, 8
    minimumBribes(myArray);
  }

  static void minimumBribes(int[] q) {

    List<Integer> unsortedList = new ArrayList<Integer>();
    List<Integer> sortedList = new ArrayList<Integer>();
    int answer = 0;
    int bribes = 0;
    boolean flag = false;

    for (int i = 0; i < q.length; i++) {
      unsortedList.add(q[i]);
    }

    Arrays.sort(q);

    for (int i = 0; i < unsortedList.size(); i++) {
      sortedList.add(q[i]);
      bribes = sortedList.indexOf(q[i]) - unsortedList.indexOf(q[i]);

      if (bribes > 2) {
        flag = true;
        System.out.println("Too chaotic");
        break;
      } else {
        if (bribes > 0)
          answer += bribes;
      }
    }

    if (flag == false) {
      System.out.println(answer);
    }
  }

}
