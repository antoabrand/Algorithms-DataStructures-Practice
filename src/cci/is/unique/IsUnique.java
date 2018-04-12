package cci.is.unique;

import java.util.*; 

public class IsUnique {

	public static void main(String[] args) {
		
	String name = "abrm";
	
	System.out.println(isUnique(name));
	System.out.println(isUnique0(name));
	
	}
	
	//solution from CCI book
	public static Boolean isUnique0(String str) {
		
		//if ASCII - 128 unique characters available to check that first
		//extended ASCII 256
		//UNICODE - UTF-8=256,UTF-16-2^16,UTF-32-2^32
		if(str.length() > 128) return false; 
		
		//create a boolean array 
		boolean [] char_set = new boolean [128];
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(char_set[val]==true)return false; //
			char_set[val] = true; 
		}
	
		return true; 
	}

	//using a Set as a way to manage unique characters
	public static String isUnique(String name) {
		
		try {
			List<String> nameListed =  Arrays.asList(name.split(""));
			Set <String> nameHashSet = new HashSet<>(); 
			
			for(String character : nameListed) {
				nameHashSet.add(character);
			}
			
			if(nameListed.size() == nameHashSet.size()) {
				return "IS UNIQUE";
			} else {
				return "IS NOT UNIQUE";
			}
		}
		catch(Exception e) {
			System.out.println("something no beuno");
		}
	
		return "";
	}

}
