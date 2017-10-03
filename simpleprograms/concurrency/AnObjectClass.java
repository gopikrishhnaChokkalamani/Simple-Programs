package com.gi.simpleprograms.concurrency;

public class AnObjectClass {

	public void printSomething(int n) {
		synchronized (this) {
			for (int i = 0; i <= n; i++) {
				System.out.println(Thread.currentThread().getName() + " - " + (n * i));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
