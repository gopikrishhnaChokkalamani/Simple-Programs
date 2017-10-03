package com.gi.simpleprograms.java8;

public class PerformanceService implements Performance {

	@Override
	public int studentPerformance(int Maths, int Physics, int Chemistry) {
		// TODO Auto-generated method stub
		System.out.println("Student Performance calculated");
		return (Maths + Physics + Chemistry) / 3;
	}

}
