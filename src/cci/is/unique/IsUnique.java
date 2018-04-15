package cci.is.unique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set; 

public class IsUnique {

	public static void main(String[] args) {
	Random r = new Random();
	String name = "abrm҂";
	
	char [] randoString = new char [256];
	StringBuilder s = new StringBuilder();
	
	for(int i = 0; i < 1000; i++) {
		char c = (char)r.nextInt(128);
			if( c != '\n' && c != ' ') {
				s.append(c);
			}
	}
	
	
	
//	System.out.println(s.toString().trim());
	System.out.println(isUnique(s.toString().trim()));
	}
	
	//solution from CCI book
	public static Boolean isUnique0(String str) {
		
		//if ASCII - 128 unique characters available to check that first
		//extended ASCII 256
		//UNICODE - UTF-8=256,UTF-16-2^16,UTF-32-2^32
		if(str.length() > 128) return false; 
		
		//create a boolean array 
		boolean [] char_set = new boolean [(int) Math.pow(2,30)];
		for(int i = 0; i < str.length(); i++) {

			char test = (char)101; 
			
			
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
