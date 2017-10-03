package com.gi.simpleprograms.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StreamExample {

	public static void main(String[] args) {

		List<Person> person_list = Arrays.asList(new Person("josh", "krish", 21), new Person("aosh", "vrisha", 22),
				new Person("vosh", "wrish", 23), new Person("rosh", "vrish", 24), new Person("iosh", "mrish", 25));

		person_list.stream().filter(p -> p.getLastName().startsWith("v")).limit(1).forEach(System.out::println);

		Random random = new Random();
		random.ints().limit(1).sorted().forEach(System.out::println);

		List<String> array_list = Arrays.asList("qqq", "asdas", "fgfg", "werwe", "cvbcvb", "nmnmn", "yiyui", "aqweqwe",
				"aqweqw", "acvxcv", "atryrty");

		array_list.stream().limit(11).sorted().filter(a -> a.startsWith("a")).forEach(System.out::println);

	}

}
