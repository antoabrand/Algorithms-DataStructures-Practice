package com.leetcode;

import java.util.*;

public class BalancedSubStrings {

  public static void main(String[] args) {
    String test =
        "LLLLRLLRRLLRLRLRLRLRRLLRRLLRLRRRRLLRRLLLRLRRRLRRLLRLRRRRLLRLRLRLRRLRLRLLLRLLRRLRLRRRRRLLRRRLRRLLRLLRLLLRLRLLLLLRLLLLLLRRLLLRRRRRRLRRLRLRRLLRLRRRRRRLRRRRRLLRRLLRRLRLLRRRRLRRRRLRLRLLRRRLLLLRRLLLLRRLRRRLLRRRRRRLRLLLRLRRLRLLLRRRLRLLRRLRLRLLLRRLLLLRRLRLRRLRLRRRRLRLRLRLRRLLRRLRLRLLLRLRRRLRRRLRRLRLLLRLLRRRRRLRLLLLRRLLRLLLRRLLRRLLLLLLRLLRRRRRRLRRLLLRRLLLLRRLRRLLLLLRRRRLRLRRLRLLRLLLRLLRLLLRLLRLRLRLLLRLLLLL";
    int answer = balancedStrings(test);
    // System.out.println(answer);
    testCompare();
  }

  // public static int balancedSplitString(String s) {
  //
  // if (s.length() % 2 != 0)
  // return 0;
  //
  // List<String> subStrings = new ArrayList<>();
  // // stack
  // Character[] stack = new Character[s.length()];
  // // initialize the map so we dont get null pointer
  // Map<Character, Integer> letterTracker = new HashMap<>();
  // letterTracker.put('L', 0);
  // letterTracker.put('R', 0);
  // int stackIndex = 0;
  //
  // for (int i = 0; i < s.length(); i++) {
  //
  // if (s.charAt(i) == 'L') {
  // letterTracker.put('L', letterTracker.get('L') + 1);
  // } else {
  // letterTracker.put('R', letterTracker.get('R') + 1);
  // }
  //
  // stack[stackIndex] = s.charAt(i);
  //
  // if (letterTracker.get('R') == letterTracker.get('L')) {
  // subStrings.add(pop(stack));
  // for (int j = 0; j < stack.length; j++) {
  // stack[j] = null;
  // }
  // letterTracker.put('L', 0);
  // letterTracker.put('R', 0);
  // stackIndex = 0;
  // }
  //
  // stackIndex++;
  //
  // }
  //
  // return subStrings.size();
  // }
  //
  // public static String pop(Character[] stack) {
  // StringBuilder sb = new StringBuilder();
  //
  // for (Character c : stack) {
  // if (c != null)
  // sb.append(c.toString());
  // }
  //
  // return sb.toString();
  // }
  //
  // private static int balancedSplitString(String test) {
  //
  // if (test.length() % 2 != 0) // cant have balanced substrings if its not even length so return 0
  // return 0;
  //
  // List<String> subStrs = new ArrayList<>();
  // Character[] stack = new Character[test.length()];
  //
  // Map<Character, Integer> letterTracker = new HashMap<>();
  // // initialize so we don't get null pointer exception when i add to the map
  // letterTracker.put('R', 0);
  // letterTracker.put('L', 0);
  //
  // // create a list of substrings that are balanced
  // for (int i = 0; i < test.length(); i++) {
  // //track my letters
  // if('R' == test.charAt(i)){
  // letterTracker.put('R', letterTracker.get('R') + 1);
  // } else {
  // letterTracker.put('L', letterTracker.get('L') + 1);
  // }
  // // build stack
  // stack[i] = test.charAt(i);
  //
  // if (letterTracker.get('R') == letterTracker.get('L')) {
  // subStrs.add(pop(stack));
  // clearTrackers(stack, letterTracker);
  // }
  // }
  //
  // return subStrs.size();
  // }
  //
  // private static String pop(Character[] stack) {
  // StringBuilder sb = new StringBuilder();
  //
  // for (Character c : stack) {
  // if (c != null)
  // sb.append(c.toString());
  // }
  //
  // return sb.toString();
  // }

  // private static void clearTrackers(Character[] stack, Map<Character, Integer> letterTracker) {
  // resetStack(stack);
  // resetTracker(letterTracker);
  // }
  //
  // private static void resetStack(Character[] stack) {
  // for (int i = 0; i < stack.length; i++) {
  // stack[i] = null;
  // }
  // }
  //
  // private static void resetTracker(Map<Character, Integer> letterTracker) {
  // letterTracker.put('R', 0);
  // letterTracker.put('L', 0);
  // }


  public static int compare(int x, int y) {

    return x + y;
  }

  public static void testCompare() {
    Short a = 5;
    System.out.println(compare(a, 6));
  }

  public static int balancedStrings(String s) {

    int countL = 0;
    int countR = 0;
    int result = 0;

    for (Character c : s.toCharArray()) {
      if (c == 'R') {
        countR++;
      } else {
        countL++;
      }

      if (countL == countR) {
        ++result;
        countL = 0;
        countR = 0;
      }
    }

    return result;
  }
}
