package com.hackerrank;

/**
 * 
 * Your task is to create the class Add and the required methods so that the code prints the sum of
 * the numbers passed to the function add.
 * 
 *
 * Sample Input
 * 
 * 1 2 3 4 5 6
 * 
 * 
 * Sample Output
 * 
 * 1+2=3 1+2+3=6 1+2+3+4+5=15 1+2+3+4+5+6=21
 *
 *
 *
 */

public class Add {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    add(1, 2, 4, 2);
  }

  private static void add(Integer... num) {
    Integer sum = 0;
    String answer = "";

    try {
      for (Integer i : num) {
        sum += i;
        System.out.print(answer + i);
        answer = "+";
      }
    } catch (Exception e) {
      System.out.print(e.toString());
    }

    System.out.println("=" + sum);
  }


}
