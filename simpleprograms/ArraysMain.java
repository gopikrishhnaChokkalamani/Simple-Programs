package com.gi.simpleprograms;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class ArraysMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] arr = new boolean[] { true, false, true };
		boolean[] arr_bool = new boolean[] { true, false, true };

		boolean result = Arrays.equals(arr, arr_bool);

		String[] string_arr = new String[] { "s1", "s2", "s3" };

		List lt = Arrays.asList(string_arr);

		Hashtable ht = new Hashtable();
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");

		Enumeration it = ht.keys();

		while (it.hasMoreElements()) {
			System.out.println(it.nextElement());
		}
		
		Map hm = new HashMap();
		hm.put("1", "One");
		hm.put("2", "Two");
		hm.put("3", "Three");
		
		int number = 12345;
		int revNumber = 0;
		
		while(number!=0){
			revNumber = revNumber * 10; //0   5*10 = 50
			revNumber += number % 10; // 0 + 5 = 5  1234%10 -> 4  54
			number = number/10; //1234
		}
		System.out.println(revNumber);
		
		int fact = 5;
		
		for(int i=(fact-1);i>1;i--){
			System.out.println();
		}
		

	}

}
