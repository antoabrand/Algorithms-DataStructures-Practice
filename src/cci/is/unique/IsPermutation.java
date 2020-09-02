package cci.is.unique;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IsPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test0 = "dogs   ";
		String test1 = "GsOD1";
		
		System.out.println(isPermutation(test0,test1));
		System.out.println(isPermutation1(test0,test1));
	}
	
	public static boolean isPermutation(String s1, String s2) {
		boolean flag = false;
		
		if(s1.trim().length()== s2.trim().length()) {
			
			List<String> s1Array = Arrays.asList(s1.toLowerCase().trim().split(""));
			List<String> s2Array = Arrays.asList(s2.toLowerCase().trim().split(""));
			Collections.sort(s1Array);
			Collections.sort(s2Array);
			
			for(int i = 0; i < s1Array.size(); i++) {
				if(s1Array.get(i).equals(s2Array.get(i))) {
					flag=true; 
				}
				else flag = false; 
			}
		}
		else return false; 
	
		return flag; 
	}
	
	
	public static boolean isPermutation1(String s1, String s2) {
		int[] tracker = new int [128];
		String trimmedS1 = s1.trim().toLowerCase();
		String trimmedS2 = s2.trim().toLowerCase();
		
		if(trimmedS1.length() != trimmedS2.length()) return false;
		
		for(int i = 0; i < trimmedS1.length(); i++) {
			tracker[trimmedS1.charAt(i)]++;
		}
		
		for(int j = 0; j < trimmedS2.length(); j++) {
			tracker[trimmedS2.charAt(j)]--;
			if(tracker[trimmedS2.charAt(j)] < 0) {
				return false;
			}
		}
		
		
		return true;
	}

}
