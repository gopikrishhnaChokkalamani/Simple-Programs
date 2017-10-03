package com.gi.simpleprograms.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hash_set = new HashSet<String>();

		hash_set.add("string1");
		hash_set.add("qweery");
		hash_set.add("asdfg");
		hash_set.add("zxcvbn");
		hash_set.add("rtyuio");
		hash_set.add("dfghk");
		hash_set.add("strbnmhj");
		hash_set.add("hjklio");
		hash_set.add("poiyuyu");
		hash_set.add("cvdfddf");

		Iterator<String> it = hash_set.iterator();
		while (it.hasNext()) {
			System.out.println("Hashset - " + it.next());
		}

	}

}
