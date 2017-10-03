package com.gi.simpleprograms.threads;

public class ExtendThreadClassMain extends java.lang.Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread 1 is running....");
		ExtendThreadClassMain extendThreadClassMain = new ExtendThreadClassMain();
		extendThreadClassMain.setName("First Thread");
		extendThreadClassMain.setPriority(Thread.MAX_PRIORITY);
		extendThreadClassMain.start();

		try {
			System.out.println("Thread 1 join....");
			extendThreadClassMain.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Thread 2 is running....");
		ExtendThreadClassMain extendThreadClassMain1 = new ExtendThreadClassMain();
		extendThreadClassMain1.setName("Second Thread");
		extendThreadClassMain.setPriority(Thread.MIN_PRIORITY);
		extendThreadClassMain1.start();

		System.out.println("Thread 3 is running....");
		ExtendThreadClassMain extendThreadClassMain2 = new ExtendThreadClassMain();
		extendThreadClassMain2.setName("Third Thread");
		extendThreadClassMain.setPriority(Thread.NORM_PRIORITY);
		extendThreadClassMain.setDaemon(true);
		extendThreadClassMain2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("insde the run() method....");

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Current Thread Name - " + Thread.currentThread().getName());
			System.out.println("Current Thread Priority - " + Thread.currentThread().getPriority());
			System.out.println(i);

		}
	}

}
