package com.vikrant.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vikrant Kumar Chauhan
 *  date:Mar 15, 2024
 *  time:2:30:39 PM
 *  package_name:DailyPractice
 *  Thanks,
 *  Vikrant
 */
public class ReverseAListansSort {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(4,6,7,8,3,9,42);
		List<Integer> evenlist = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		List<Integer> oddlist =list.stream().filter(e->e%2!=0).collect(Collectors.toList());
		
		Collections.sort(evenlist);
		Collections.sort(oddlist);
		
		List<Integer>  listfinal = new ArrayList<>();
		listfinal.addAll(evenlist);
		listfinal.addAll(oddlist);
		
		System.out.println("Before sorting:"+list);
		System.out.println("==========================================");
		System.out.println("After sorting:"+listfinal);
		
		
		
		
		
	}

}
