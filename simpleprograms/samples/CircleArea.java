package com.gi.simpleprograms.samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleArea {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int radius = 0;
		try {
			radius = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		double area = Math.PI * radius * radius;
		
		System.out.println(area);
	}
}
