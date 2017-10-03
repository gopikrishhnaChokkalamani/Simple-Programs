package com.gi.simpleprograms.samples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 20);
		map.put("C++", 45);
		map.put("Java2Novice", 2);
		map.put("Unix", 67);
		map.put("MAC", 26);
		map.put("Why this kolavari", 93);

		Collection c = map.entrySet();
		Iterator it = c.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println();
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> listOfMaps = new ArrayList<Entry<String, Integer>>(set);

		Collections.sort(listOfMaps, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				// return o1.getValue().compareTo(o2.getValue()); compare by
				// value
				return o1.getKey().compareTo(o2.getKey()); // compare by key
			}
		});

		for (Map.Entry<String, Integer> i : listOfMaps) {
			System.out.println("Key Name - " + i.getKey() + ", Value - " + i.getValue());
		}
	}

}
