package com.gi.simpleprograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hash_map = new HashMap<>();
		hash_map.put(120, "string");
		hash_map.put(121, "string1");
		hash_map.put(122, "string2");
		hash_map.put(123, "string3");

		for (Map.Entry m : hash_map.entrySet()) {
			System.out.println("Key - " + m.getKey() + ", Value - " + m.getValue());

		}
	}

}
