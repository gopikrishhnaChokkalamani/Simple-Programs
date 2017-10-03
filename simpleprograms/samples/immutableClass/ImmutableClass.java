package com.gi.simpleprograms.samples.immutableClass;

public final class ImmutableClass {

	private String stringVar;
	private int intVar;

	private ImmutableClass(String stringVar, int intVar) {
		this.stringVar = stringVar;
		this.intVar = intVar;
	}

	public static ImmutableClass getInstance(String stringVar, int intVar) {
		return new ImmutableClass(stringVar, intVar);
	}

	public String getStringVar() {
		return stringVar;
	}

	public int getIntVar() {
		return intVar;
	}
}
