package cci.is.unique;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IsPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test0 = "dogs   ";
		String test1 = "GsOD";
		
		System.out.println(isPermutation(test0,test1));
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
	
	

}
