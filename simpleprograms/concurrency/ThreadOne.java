package com.gi.simpleprograms.concurrency;

public class ThreadOne extends Thread {

	AnObjectClass anObjectClass;

	public ThreadOne(AnObjectClass anObjectClass) {
		super();
		this.anObjectClass = anObjectClass;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		anObjectClass.printSomething(5);
	}

}
