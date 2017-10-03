package com.gi.simpleprograms.samples.diamonProblem;

public class ClassA implements InterfaceA, InterfaceB {

	@Override
	public void superInterfaceDefaultMethod() {
		// usage of default method to solve the diamond problem
		// and indicate Java to the method in InterfaceB
		InterfaceB.super.superInterfaceDefaultMethod();
	}

	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.superInterfaceDefaultMethod();
	}
}
