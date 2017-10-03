package com.gi.simpleprograms.samples;

public class OddEvenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 0) {
				System.out.println("Even - " + i);
			} else {
				System.out.println("Odd - " + i);
			}
		}
	}

}
