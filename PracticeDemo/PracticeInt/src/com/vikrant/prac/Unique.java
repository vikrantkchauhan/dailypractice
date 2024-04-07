package com.vikrant.prac;

import java.util.HashSet;
import java.util.Set;

public class Unique {

	public static void main(String[] args) {
		String s = "ajhdjahja";
		// char[] arr = tochar[s];
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++)
				if (s.charAt(i) == s.charAt(j)) {
					flag = true;
					break;
				}

		}

		if (flag == true) {
			System.out.println("Is not unique");
		} else {
			System.out.println("Is unique");
		}
		
		System.out.println("From second method of set");
		System.out.println("---------------------");
		isuinques(s);
		
	}
	
	
	static void isuinques(String s) {
		
		Set<Character> st = new HashSet<>();
		for (int i=0;i<s.length();i++) {
			st.add(s.charAt(i));
		}
		
		if (st.size()==s.length()) {
			System.out.println("Is  unique");
		}else {
			System.out.println("Is not unique");
		}
	}

}
