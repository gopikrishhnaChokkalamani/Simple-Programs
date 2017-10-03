package com.gi.simpleprograms;

import java.util.Hashtable;
import java.util.Map;

public class HashTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();
		hash_table.put(120, "string");
		hash_table.put(121, "string1");
		hash_table.put(122, "string2");
		hash_table.put(123, "string3");

		for (Map.Entry m : hash_table.entrySet()) {
			System.out.println("Key - " + m.getKey() + ", Value - " + m.getValue());
		}
	}

}
