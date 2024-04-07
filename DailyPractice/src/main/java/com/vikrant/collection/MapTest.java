package com.vikrant.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Vikrant Kumar Chauhan date:Mar 13, 2024 time:10:43:57 AM
 *         package_name:DailyPractice Thanks, Vikrant
 */
public class MapTest {

	public static void main(String[] args) {

		Map<String, Integer> mp = new HashMap<>();

		for (int i = 0; i < 1000; i++) {
			mp.put("" + i + "Vikrant" + 1, i + 2);
		}

		System.out.print(mp);

		System.out.println(mp.keySet());
		System.out.println(mp.values());
		
		for(String g : mp.keySet()) {
			System.out.println(g);
		}
		
		for(int h : mp.values()) {
			System.out.println(h);
		}
		
		
		
		
		
		System.out.println("sdsdsdsdsdsd"+mp.remove(1));
		Set st = mp.entrySet();
		Iterator it = st.iterator();
		while (it.hasNext()) {

			Map.Entry<String, Integer> entry = (Entry) it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}
		
		System.out.println(mp.size());

	}

}
