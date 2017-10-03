package com.gi.simpleprograms;


import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("startTime - " + startTime);
		LinkedList<String> linked_list = new LinkedList<>();
		linked_list.add("string1");
		linked_list.add("qweery");
		linked_list.add("asdfg");
		linked_list.add("zxcvbn");
		linked_list.add("rtyuio");
		linked_list.add("dfghk");
		linked_list.add("strbnmhj");
		linked_list.add("hjklio");
		linked_list.add("poiyuyu");
		linked_list.add("cvdfddf");

		Iterator it = linked_list.iterator();
		while (it.hasNext()) {
			System.out.println("Linked List - " + it.next());
		}
		long stopTime = System.currentTimeMillis();
		System.out.println("StopTime - " + stopTime);
	    long elapsedTime = stopTime - startTime;
		System.out.println("elapsedTime - " + elapsedTime);
	}

}
