package com.gi.simpleprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.out.println("startTime - " + startTime);
		// long elapsedTime = 0L;
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("string1");
		arrayList.add("qweery");
		arrayList.add("asdfg");
		arrayList.add("zxcvbn");
		arrayList.add("rtyuio");
		arrayList.add("dfghk");
		arrayList.add("strbnmhj");
		arrayList.add("hjklio");
		arrayList.add("poiyuyu");
		arrayList.add("cvdfddf");

		Iterator it = arrayList.iterator();
		while (it.hasNext()) {
			System.out.println("Arraylist - " + it.next());
		}

		ListIterator<String> list_iterator = arrayList.listIterator();
		while (list_iterator.hasPrevious()) {
			System.out.println("List Iterator -" + list_iterator.previous());
		}

		long stopTime = System.currentTimeMillis();
		System.out.println("StopTime - " + stopTime);
		long elapsedTime = stopTime - startTime;
		System.out.println("elapsedTime - " + elapsedTime);
	}

}
