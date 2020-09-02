/**
 * Example: 

Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */

package com.code.leet;

import java.util.HashSet;
import java.util.Set;

public class HappyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isHappy();
	}

	public static void isHappy() {
	
		Set<Integer> mySet = new HashSet<>();
		mySet.add(1);
		mySet.add(5);
		mySet.add(6);
		mySet.add(1);

		mySet.forEach(num -> System.out.println(num));

	}
}
