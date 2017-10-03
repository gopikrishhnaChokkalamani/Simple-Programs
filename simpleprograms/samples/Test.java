package com.gi.simpleprograms.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		// sortMap();
		// reverseString();
		// factorial();
		//fibonacci();
		reverseNumber();
	}

	public static void sortMap() {

		Map<String, Integer> map = new HashMap();

		map.put("Java", 20);
		map.put("C++", 45);
		map.put("Java2Novice", 2);
		map.put("Unix", 67);
		map.put("MAC", 26);
		map.put("Why this kolavari", 93);

		Set<Entry<String, Integer>> tempSet = map.entrySet();

		List<Entry<String, Integer>> listofmaps = new ArrayList<Entry<String, Integer>>(tempSet);

		Collections.sort(listofmaps, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

		for (Map.Entry<String, Integer> i : listofmaps) {
			System.out.println(i.getKey() + " - " + i.getValue());
		}
	}

	public static void reverseString() {
		String name = "madam";
		String palindrome = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			palindrome += name.charAt(i);
		}
		if (name.equalsIgnoreCase(palindrome))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

	public static void factorial() {
		int number = 5;
		int fact = number;
		for (int i = (number - 1); i > 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void fibonacci() {
		int number = 10;
		int[] intArray = new int[number];
		intArray[0] = 0;
		System.out.print(intArray[0] + "\t");
		intArray[1] = 1;
		System.out.print(intArray[1] + "\t");
		for (int i = 2; i < number; i++) {
			intArray[i] = intArray[i - 1] + intArray[i - 2];
			System.out.print(intArray[i] + "\t");
		}
	}
	
	public static void reverseNumber() {
		int number = 12345;
		int rev = 0;
		while(number!=0){
			rev = rev * 10;
			rev = rev + number%10;
			number = number/10;
		}
		System.out.println(rev);
	}
}
