package com.gi.simpleprograms.threads;

public class ImplementsRunnableMain implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementsRunnableMain implementsRunnableMain = new ImplementsRunnableMain();
		Thread thread = new Thread(implementsRunnableMain);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running... Runnable Interface...");
	}

}
