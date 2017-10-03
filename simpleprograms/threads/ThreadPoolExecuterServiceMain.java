package com.gi.simpleprograms.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecuterServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		ExecutorService executorService_inside = Executors.newFixedThreadPool(3);
		for (int i = 1; i < 10; i++) {
			Runnable workerThread = new BackgroundProcess("BgWorkerManager" + i);
			executorService.execute(workerThread);
			// ExecutorService executorService_inside =
			// Executors.newFixedThreadPool(3);
			Runnable workerThread1 = new BackgroundProcess("InnerBgWorkerManager" + i);
			executorService_inside.execute(workerThread1);
		}
		executorService.shutdown();
		executorService_inside.shutdown();
		while (!executorService.isTerminated()) {
			// System.out.println("All Thread operations completed");
		}
		System.out.println("All Thread operations completed");
	}

}
