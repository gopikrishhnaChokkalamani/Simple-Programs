package com.gi.simpleprograms.samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = 0;
		try {
			size = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		fibonacciSeries(size);

		factorial(size);

		boolean bool_var = primeNumberOrNot(size);
		System.out.println(size + " - " + bool_var);
		System.out.println("\n");

		randomCheck(size);

		stringReverse();
	}

	public static void fibonacciSeries(int size) {
		int[] intArray = new int[size];
		intArray[0] = 0;
		System.out.print(intArray[0] + "\t");
		intArray[1] = 1;
		System.out.print(intArray[1] + "\t");
		for (int i = 2; i < size; i++) {
			intArray[i] = intArray[i - 1] + intArray[i - 2];
		}
		System.out.println("###Fibonacci Series###");
		for (int j = 0; j < size; j++) {
			System.out.print(intArray[j] + "\t");
		}
		System.out.println("\n");
	}

	public static void factorial(int number) {
		int fact = 0;
		fact = number;
		for (int i = (number - 1); i > 1; i--) {
			fact = fact * i;
		}
		System.out.println("###Factorial Number###");
		System.out.println(fact);
		System.out.println("\n");
	}

	public static boolean primeNumberOrNot(int number) {
		System.out.println("###Prime Number###");
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				// System.out.println(number + " is not a prime number");
				// System.out.println("\n");
				return false;
			}
		}
		return true;
	}

	/*
	 * Create an int array of random elements, user will give some number, you
	 * should add consecutive array element and find our when adding which two u
	 * get the user number
	 * 
	 * User wll give a number, example 60, from 0 to 60, u should find summation
	 * of which two numbers gives the total as 60, or whatever user inputted
	 * number
	 */

	public static void randomCheck(int range) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		try {
			number = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// int[] intArray = new int[range];
		int[] anotherArray = new int[range];
		for (int i = 0; i < range; i++) {
			anotherArray[i] = i;
		}

		for (int j = 0; j < anotherArray.length; j++) {
			System.out.println(anotherArray[j]);
		}

		System.out.println(anotherArray.length);
		for (int i = 0; i < anotherArray.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp_num = anotherArray[i] + anotherArray[j];
				// System.out.println(intArray[i]);
				if (temp_num == range) {
					System.out.println(
							"Addition of " + anotherArray[i] + " and " + anotherArray[j] + " gives -> " + range);
				}
			}
		}
	}

	public static void stringReverse() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number = null;
		try {
			number = br.readLine().toString();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String reverse = reverseString(number);
		System.out.println(reverse);
	}

	public static String reverseString(String var) {
		String reverse = "";
		if (var.length() == 1) {
			return var;
		} else {
			reverse += var.charAt(var.length() - 1) + reverseString(var.substring(0, var.length() - 1));
			return reverse;
		}
	}
}
