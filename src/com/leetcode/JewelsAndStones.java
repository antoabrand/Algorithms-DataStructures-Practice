package com.leetcode;

/**
 * 
 * @author Tony
 *
 * 
 *         You're given strings J representing the types of stones that are jewels, and S
 *         representing the stones you have. Each character in S is a type of stone you have. You
 *         want to know how many of the stones you have are also jewels.
 * 
 *         The letters in J are guaranteed distinct, and all characters in J and S are letters.
 *         Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * 
 *         Example 1:
 * 
 *         Input: J = "aA", S = "aAAbbbb" Output: 3
 * 
 *         Example 2:
 * 
 *         Input: J = "z", S = "ZZ" Output: 0
 * 
 *         Note:
 * 
 *         S and J will consist of letters and have length at most 50. The characters in J are
 *         distinct.
 * 
 */

public class JewelsAndStones {

  public static void main(String[] args) {
    String testString1 = "aA";
    String testString2 = "aAAbbbb";

    System.out.println(countTheJewels(testString1, testString2));

  }

  private static int countTheJewels(String testString1, String testString2) {

    // iterate this if a character in string1 is found in string2
    int numOfJewels = 0;

    char[] stringArray = testString1.toCharArray();
    char[] stringArray2 = testString2.toCharArray();

    for (int i = 0; i < stringArray.length; i++) {
      for (int j = 0; j < stringArray2.length; j++) {
        if (stringArray[i] == stringArray2[j]) {
          ++numOfJewels;
        }
      }
    }

    return numOfJewels;
  }

}
