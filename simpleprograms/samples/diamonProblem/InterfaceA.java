package com.gi.simpleprograms.samples.diamonProblem;

public interface InterfaceA extends SuperInterface {

	default void superInterfaceDefaultMethod() {
		System.out.println("Super Interface call - IntefaceA");
	}
}
