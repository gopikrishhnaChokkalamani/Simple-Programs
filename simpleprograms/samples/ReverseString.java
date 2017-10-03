package com.gi.simpleprograms.samples;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String - ");

		String name = sc.nextLine();

		System.out.println("Enter a Number - ");

		int number = sc.nextInt();

		int reverse = 0;

		for (int i = name.length() - 1; i > 0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();

		while (number != 0) {
			reverse *= 10;
			reverse += number % 10;
			number = number / 10;
		}

		System.out.println(reverse);

		sc.close();

	}

}
