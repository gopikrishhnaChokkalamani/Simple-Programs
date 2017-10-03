package com.gi.simpleprograms.samples.diamonProblem;

public interface InterfaceB extends SuperInterface {

	default void superInterfaceDefaultMethod() {
		System.out.println("Super Interface call - IntefaceB");
	}

}
