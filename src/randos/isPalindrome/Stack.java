package randos.isPalindrome;

import java.util.*;

public class Stack {

	int top = 0;
	List<Integer> stack = new ArrayList<>();

	public static void main(String[] args) {
		Stack test = new Stack();
		
//		test.pop();
		
		short x = Short.MAX_VALUE;
		short y = 2; 
		short z = (short) (x + y); 
		System.out.println(z);
		
		int ix = Short.MAX_VALUE;
		int iy = 2; 
		System.out.println(ix + iy);
	}

	private void push(int ...values) {
		for(int val : values) {
			stack.add(val);
			top++;
		}
		
	}

	private int pop() {
		if (stack.size() < 1) {
			System.out.println("Empty stack");
			return 0;
		}
		top--;
		int val = stack.get(top);
		stack.remove(top);
		return val;
	}

	private boolean isEmpty() {
		if(stack.size() < 1) {
			return true; 
		}
		return false;
	}
	
	private void seeStack() {
		for(int nums: stack) {
			System.out.print(nums + " ");
		}
	}

//	static void checkMagazine(String[] magazine, String[] note) {
//		boolean answer = true;
//		Map<String, Integer> magMap = new HashMap<>();
//		Map<String, Integer> noteMap = new HashMap<>();
//
//		magMap = countWords(magazine, magMap);
//		noteMap = countWords(note, noteMap);
//
//		for (String n : noteMap.keySet()) {
//			if (magMap.containsKey(n) && magMap.get(n) >= noteMap.get(n)) {
//				continue;
//			} else {
//				answer = false;
//				break; 
//			}
//		}
//		
//		if(answer == true) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
//	}
//
//	private static Map<String, Integer> countWords(String[] arr, Map<String, Integer> map) {
//		
//		Integer count = 1;
//		
//		for (String s : arr) {
//			if (map.containsKey(s)) {
//				map.put(s, map.get(s) + 1);
//			} else {
//				map.put(s, count);
//			}
//		}
//
//		return map;
//	}

}
