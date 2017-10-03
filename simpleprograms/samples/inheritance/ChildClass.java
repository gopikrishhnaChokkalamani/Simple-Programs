package com.gi.simpleprograms.samples.inheritance;

public class ChildClass extends ParentClass {

	public void childMethod() {
		System.out.println("Child Class print");
	}

	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.parentMethod();
	}
}
