package com.vikrant.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;



/**
 * @author Vikrant Kumar Chauhan
 *  date:Mar 11, 2024
 *  time:12:14:50 AM
 *  package_name:DailyPractice
 *  Thanks,
 *  Vikrant
 */
public class ListTest {
	
	public static void main(String[] args) {
		
		List<Integer>  ob  = new CopyOnWriteArrayList<Integer>();
		
		ob.add(100);
		ob.add(200);
		
		Integer  res =Collections.binarySearch(ob,10220);
		System.out.println("sasasas"+res);
		
		
		 Iterator<Integer> itr = ob.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
			 ob.add(22323);
			 ob.remove(0);
			 System.out.println(itr.next());
			 
		 }
		 
		 List<Integer>  oj = new LinkedList<>();
		 oj.add(0, 12);
		 oj.add(1, 23);
		 oj.add(0, 1);
		 oj.add(1, 233);
		 
		 ListIterator<Integer>  onj = oj.listIterator() ;
		 while (onj.hasNext()) {
			 System.out.println(onj.next());
		 }
		 
		 Object[] arr = oj.toArray();
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		 
		 System.out.println(Arrays.toString(arr));
		
		
		System.out.println("----------------------------");
		
		String as ="aasd ";
		
		Set<Character> s = new HashSet<>();
		
		for (int i=0;i<as.length();i++) {
			//Character c = as.charAt(i);
			s.add(as.charAt(i));
			s.add(null);
			
			
		}
		s.add(null);
		
		System.out.println(s);
		
		int lengthori = as.length();
		int lentafter = s.size();
		
		System.out.println(lengthori);
		System.out.println(lentafter);
		
		 
		
		System.out.println("==================================");
		
		
		HashSet<Integer>  t = new LinkedHashSet<Integer>();
		
		t.add(1212);
		t.add(1234);
		
		
		HashSet<Integer> t1 = new HashSet<>();
		
		t1.add(1212);
		t1.add(1234);
		
		System.out.println(t);
		System.out.println(t1);
		
				
				
		
		
		
		
		
		
	}

}
