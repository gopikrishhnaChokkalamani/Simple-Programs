package com.gi.simpleprograms.samples;

public class SingleTon {

	private static SingleTon singleTon;

	private SingleTon() {

	}

	public static SingleTon getSingleTon() {
		return singleTon;
	}

	public static void setSingleTon(SingleTon singleTon) {
		SingleTon.singleTon = singleTon;
	}

}
