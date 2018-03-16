package cci.is.unique;

import java.util.*; 

public class IsUnique {

	public static void main(String[] args) {
		
	String name = "abrm";
	
	System.out.println(isUnique(name));
	
	}

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
