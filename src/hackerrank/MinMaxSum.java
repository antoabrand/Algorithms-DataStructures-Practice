package hackerrank;

import java.util.*;

public class MinMaxSum {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] testArray = {396285104, 573261094, 759641832, 819230764, 364801279};

    int[] answer = minMaxSum(testArray);
    for (int i : answer) {
      System.out.print(i);
    }
  }

  private static int[] minMaxSum(int[] arr) {

    List<Integer> sortedList = new ArrayList<>();

    for (int i : arr) {
      sortedList.add((Integer) i);
    }
    Collections.sort(sortedList);


    Integer largestSum = 0;
    Integer minSum = 0;

    int[] answer = new int[2];
    for (int i = 1; i < sortedList.size(); i++) {
      largestSum += sortedList.get(i);
    }

    for (int i = 1; i < sortedList.size() - 1; i++) {
      minSum += sortedList.get(i);
    }
    answer[0] = minSum;
    answer[1] = largestSum;
    return answer;
  }

}
