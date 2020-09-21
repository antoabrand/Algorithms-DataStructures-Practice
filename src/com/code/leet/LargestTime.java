package com.code.leet;

public class LargestTime {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // int[] test = { 0 , 0 , 1 , 0 };
    // int[] test = { 9 , 0 , 7 , 7 };
    int[] test = {1, 2, 3, 4};
    // int[] test = { 0 , 0 , 0 , 0 };
    // int[] test = { 5 , 5 , 5 , 5 };
    //
    System.out.println(largestTimeFromDigits(test));
  }

  private static String largestTimeFromDigits(int[] A) {
    int largestHour = 0;
    int largestMins = 0;
    int hourBound = 23;
    int minsBound = 59;
    int[] pruned;

    for (int num : A) {
      if (num < 0 || num > 9) {
        return "";
      }
    }

    String largestHourResult = getMax(A, largestHour, hourBound);
    if (largestHourResult == "") {
      return "";
    }
    pruned = pruneArr(A, largestHourResult);
    String largestMinsResult = getMax(pruned, largestMins, minsBound);

    if (largestMinsResult == "") {
      return "";
    }
    return largestHourResult + ":" + largestMinsResult;

  }

  private static String getMax(int[] A, int largest, int threshold) {
    String timeToCheck = null;
    String answer = null;
    for (int outerCounter = 0; outerCounter < A.length; outerCounter++) {
      String firstNum = Integer.toString(A[outerCounter]);
      int innerCounter = outerCounter + 1;
      for (int j = innerCounter; j < (outerCounter + A.length); j++) {
        String time;

        if (j >= A.length) {
          time = firstNum + A[j - A.length];
        } else {
          time = firstNum + A[j];
        }
        timeToCheck = time;

        if (Integer.valueOf(timeToCheck) <= threshold && Integer.valueOf(timeToCheck) > largest) {
          largest = Integer.valueOf(timeToCheck);
          answer = timeToCheck;
        }
      }
    }
    if (largest == 0 && Integer.valueOf(timeToCheck) == 0) {
      return "00";
    } else if (largest == 0 && Integer.valueOf(timeToCheck) > threshold) {
      return "";
    }

    return answer;
  }

  private static int[] pruneArr(int[] A, String pruneThis) {
    String[] prune = pruneThis.split("");
    int[] pruned = new int[2];
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < prune.length; j++) {
        if (A[i] != Integer.valueOf(prune[j])) {
          pruned[j] = A[i];
          prune[j] = "99";
        }

      }

    }

    return pruned;
  }
}
