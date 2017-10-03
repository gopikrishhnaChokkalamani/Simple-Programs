package com.gi.simpleprograms.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UnitExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> person_list = Arrays.asList(new Person("josh", "krish", 21), new Person("aosh", "vrisha", 22),
				new Person("vosh", "wrish", 23), new Person("rosh", "vrish", 24), new Person("iosh", "mrish", 25));

		// sort by lastname
		Collections.sort(person_list, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

		System.out.println("Print using foreach");
		person_list.forEach(System.out::println);

		// print all
		System.out.println("Print all with last name sorting");
		printMethod(person_list, p -> true, System.out::println);

		// print all person with last name beginning with V
		System.out.println(" ");
		System.out.println("Print all with last name staring with v");
		printMethod(person_list, p -> p.getLastName().startsWith("v"), System.out::println);

		Thread t = new Thread(UnitExcercise::printMessage);

		Thread t1 = new Thread(() -> printMessage());

	}

	private static void printMessage() {
		// TODO Auto-generated method stub
		System.out.println("Method Reference Example");
	}

	public static void printMethod(List<Person> person, Predicate<Person> predicateInterface,
			Consumer<Person> consumer) {
		for (Person i : person) {
			if (predicateInterface.test(i)) {
				consumer.accept(i);
			}
		}
	}

	/*
	 * @FunctionalInterface public interface CondtionalInterface { public
	 * boolean test(Person person); }
	 */

}
