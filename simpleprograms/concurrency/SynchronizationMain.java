package com.gi.simpleprograms.concurrency;

public class SynchronizationMain extends Thread {

	AnObjectClass anObjectClass;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnObjectClass anObjectClass = new AnObjectClass();
		ThreadOne threadOne = new ThreadOne(anObjectClass);
		ThreadTwo threadTwo = new ThreadTwo(anObjectClass);

		threadOne.start();
		threadTwo.start();
	}

}
