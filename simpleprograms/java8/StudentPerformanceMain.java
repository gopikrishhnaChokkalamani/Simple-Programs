package com.gi.simpleprograms.java8;

public class StudentPerformanceMain {

	public static void main(String[] args) {
		callMethod((Maths, Physics, Chemistry) -> (Maths + Physics + Chemistry) / 3);
	}

	public static void callMethod(Performance l) {
		System.out.println("Student Average - " + l.studentPerformance(96, 94, 99));
	}
}