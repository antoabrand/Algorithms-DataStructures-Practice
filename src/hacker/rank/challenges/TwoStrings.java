package hacker.rank.challenges;

import java.util.*;

/**
 * Given two strings, determine if they share a common substring.
 * 
 **/
public class TwoStrings {

	public static void main(String[] args) {
		Map<Character, Integer> testMap = new HashMap<>();
		String s1 = "Hhello";
		String s2 = "Tony";

		String answer = "NO";

		for (int i = 0; i < s1.length(); i++) {
			testMap.put(s1.charAt(i), 1);
		}

		for (int i = 0; i < s2.length(); i++) {
			if (testMap.containsKey(s2.charAt(i))) {
				answer = "YES";
				break;
			}
		}

		System.out.println(answer);
	}

}
