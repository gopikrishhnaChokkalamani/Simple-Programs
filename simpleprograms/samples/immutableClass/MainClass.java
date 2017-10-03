package com.gi.simpleprograms.samples.immutableClass;

public class MainClass {

	public static void main(String[] args) {
		ImmutableClass imm = ImmutableClass.getInstance("Testing", 123);
		System.out.println(imm.getIntVar() + " - " + imm.getStringVar());
	}
}
