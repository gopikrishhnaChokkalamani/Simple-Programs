package com.gi.simpleprograms.threads;

public class BackgroundProcess implements Runnable {

	private String var_message;

	public BackgroundProcess(String arg) {
		this.var_message = arg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " - START -> " + var_message);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " - END -> "  + var_message);
		System.out.println("###############");
	}

}
