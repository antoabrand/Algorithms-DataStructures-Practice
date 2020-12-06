package com.leetcode;

/**
 * Description: We have two special characters. The first character can be
 * represented by one bit 0. The second character can be represented by two bits
 * (10 or 11).
 * 
 * Now given a string represented by several bits. Return whether the last
 * character must be a one-bit character or not. The given string will always
 * end with a zero.
 */
public class OneAndTwoBits {

	public static void main(String[] args) {
		int[] test = { 1, 0 };
		int[] test2 = { 1, 1, 0 };

		System.out.println(solution(test));
		System.out.println(solution(test2));
	}

	private static boolean solution(int[] bits) {
		boolean answer = true;

		for (int i = 0; i < bits.length; i++) {
			if (bits[i] == 1) {
				answer = false;
				i++;
			} else {
				answer = true;
			}
		}
		return answer;
	}
}
