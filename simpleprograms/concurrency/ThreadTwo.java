package com.gi.simpleprograms.concurrency;

public class ThreadTwo extends Thread {

	AnObjectClass anObjectClass;

	public ThreadTwo(AnObjectClass anObjectClass) {
		super();
		this.anObjectClass = anObjectClass;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		anObjectClass.printSomething(50);
	}

}
