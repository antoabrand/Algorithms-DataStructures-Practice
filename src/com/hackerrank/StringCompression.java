package com.hackerrank;

import java.util.*;

public class StringCompression {

  public static void main(String[] args) {

    String testString = "zzzszzzzzaabcaaaaaaaaaaaaaaaaaaazzz";

    System.out.println("Initial String value = " + testString);

    System.out.println("Max Compression: " + maxCompress(testString));
    System.out.println("Min Compression: " + minCompress(testString));

  }

  // compresses the string as much as possible
  // if compressed string is longer than original string return the original
  // string
  private static String maxCompress(String s) {
    Map<String, Integer> map = new HashMap<>();
    StringBuilder sb = new StringBuilder();

    List<String> stringList = Arrays.asList(s.toLowerCase().trim().split(""));
    Collections.sort(stringList);

    // get a count of all the characters in the string
    for (String str : stringList) {
      if (map.containsKey(str)) {
        map.put(str, map.get(str) + 1);
      } else
        // will execute only the first time it encounters this particular character
        map.put(str, 1);
    }

    for (String key : map.keySet()) {
      sb.append(key);
      sb.append(map.get(key));
    }

    return s.length() <= sb.toString().length() ? s : sb.toString();
  }

  // compresses as it goes - does not do maxcompression
  private static String minCompress(String s) {

    StringBuilder sb = new StringBuilder();
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      count++;
      if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
        sb.append(s.charAt(i));
        sb.append(count);

        count = 0;
      }
    }

    return s.length() <= sb.toString().length() ? s : sb.toString();
  }

}
