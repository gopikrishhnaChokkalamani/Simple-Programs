package com.gi.simpleprograms.samples;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number - ");

		int number = sc.nextInt();

		int temp = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				temp += i;
			}
		}

		if (temp == number) {
			System.out.println(temp);
		}

	}

}
