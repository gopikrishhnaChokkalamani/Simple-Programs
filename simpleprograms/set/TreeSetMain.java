package com.gi.simpleprograms.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class TreeSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> tree_set = new TreeSet<>();
		tree_set.add("string1");
		tree_set.add("qweery");
		tree_set.add("asdfg");
		tree_set.add("zxcvbn");
		tree_set.add("rtyuio");
		tree_set.add("dfghk");
		tree_set.add("strbnmhj");
		tree_set.add("hjklio");
		tree_set.add("poiyuyu");
		tree_set.add("cvdfddf");

		Iterator it = tree_set.iterator();
		while (it.hasNext()) {
			System.out.println("TreeSet - " + it.next());
		}	
	}

}
