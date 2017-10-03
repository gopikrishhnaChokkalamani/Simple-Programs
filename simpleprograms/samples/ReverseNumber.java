package com.gi.simpleprograms.samples;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 256789;
		int reverse = 0;
		while (number != 0){
			System.out.println(number);
			reverse = reverse * 10;
			System.out.println(reverse);
			reverse = reverse + number%10;
			number = number/10;
			System.out.println(reverse);
		}
		System.out.println("##################");
		System.out.println(reverse);
	}

}
