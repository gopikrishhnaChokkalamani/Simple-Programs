package com.gi.simpleprograms.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linked_hash_set = new LinkedHashSet<>();

		linked_hash_set.add("string1");
		linked_hash_set.add("qweery");
		linked_hash_set.add("asdfg");
		linked_hash_set.add("zxcvbn");
		linked_hash_set.add("rtyuio");

		Iterator it = linked_hash_set.iterator();

		while (it.hasNext()) {
			System.out.println("Linked HashSet - " + it.next());
		}

	}

}
