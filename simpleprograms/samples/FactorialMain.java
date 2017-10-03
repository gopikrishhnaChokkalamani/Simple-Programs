package com.gi.simpleprograms.samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int fact = 0;
		int num;
		try {
			fact = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		num = fact;
		for (int i = (fact - 1); i > 1; i--) {
			num = num * i;
		}
		System.out.println(num);
	}
}
