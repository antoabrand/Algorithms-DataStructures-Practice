package project.euler;

/**
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any
 * remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 */

public class SmallestMultiple {

  public static void main(String[] args) {

    long timeStart = System.currentTimeMillis();
    System.out.println(result());
    long timeEnd = System.currentTimeMillis();
    double totalTime = timeEnd - timeStart;
    System.out.println("Took this long: " + totalTime / 1000);

    // long timeStart2 = System.currentTimeMillis();
    // System.out.println(result2());
    // long timeEnd2 = System.currentTimeMillis();
    // double totalTime2 = timeEnd2 - timeStart2;
    // System.out.println("Second one Took this long: " + totalTime2 / 1000);

  }

  private static int result() {
    int result = 2520;
    int i = 0;
    int[] intArray = {9, 11, 13, 14, 15, 16, 17, 19};

    while (true) {
      for (i = 0; i < intArray.length; i++) {
        if (result % intArray[i] == 0) {
          if (i == intArray.length - 1) // checked against every index in array
            return result;
        } else {
          i = -1; // resets the index to start over
          result++;
        }
      }
    }
  }

  // private static int result2() {
  // int result = 2520;
  // for (int i = 0; i == i; i++) {
  // if (i % 9 == 0 && i % 11 == 0 && i % 13 == 0 && i % 14 == 0 && i % 15 == 0 && i % 16 == 0 && i
  // % 17 == 0
  // && i % 19 == 0) {
  // result = i;
  // }
  // }
  // return result;
  // }

}
