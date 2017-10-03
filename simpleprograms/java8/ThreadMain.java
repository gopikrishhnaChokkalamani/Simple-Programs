package com.gi.simpleprograms.java8;

public class ThreadMain implements Runnable {

	public ThreadMain() {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	public static void main(String[] args) {
		
		ThreadMain t = new ThreadMain();
		Thread th = new Thread(t);
		th.start();
	}

}
