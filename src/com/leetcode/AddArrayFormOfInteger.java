package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description: For a non-negative integer X, the array-form of X is an array of
 * its digits in left to right order. For example, if X = 1231, then the array
 * form is [1,2,3,1].
 * 
 * Given the array-form A of a non-negative integer X, return the array-form of
 * the integer X+K.
 * 
 */

public class AddArrayFormOfInteger {

	public static void main(String[] args) {
		int[] A = { 9,9,9,9,9,9,9,9,9,9};
		int K = 34;
		// answer should return an arrayList with the answer
		solution(A, K);
	}

	private static List<Integer> solution(int[] A, int K) {
		StringBuilder sb = new StringBuilder();

		for (int i : A) {
			sb.append(i);
		}
		
		Long temp = Long.parseLong(sb.toString());

		Integer answer = (int) (temp + (Integer)K);
		
		String listAnswer = answer.toString();
		
		List <String> ans = Arrays.asList(listAnswer.toString().split(""));
		List <Integer> ans2 = new ArrayList<>();
		
		for(String s : ans) {
			ans2.add(Integer.parseInt(s));
		}
		return ans2;
	}

}
