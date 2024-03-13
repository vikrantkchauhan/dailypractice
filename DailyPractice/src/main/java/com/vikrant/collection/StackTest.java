package com.vikrant.collection;

import java.util.List;
import java.util.Stack;

/**
 * @author Vikrant Kumar Chauhan
 *  date:Mar 13, 2024
 *  time:12:29:03 AM
 *  package_name:DailyPractice
 *  Thanks,
 *  Vikrant
 */
public class StackTest {
	
	public static void main(String[] args) {
		
		
		String a= "()(()(()))(";
		
		//()(()(())
		
		Stack<Character>  st = new Stack<Character>();
		
		for (int i=0;i<a.trim().length();i++) {
			if(a.charAt(i)=='(') {
			st.push(a.charAt(i));
		}else   {
			st.pop();
		}
		}
		
		int len = st.size();
		
		System.out.println(len);
		
		
	}

}
