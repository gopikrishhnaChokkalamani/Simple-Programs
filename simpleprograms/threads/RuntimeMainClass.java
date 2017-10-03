package com.gi.simpleprograms.threads;

import java.io.IOException;

public class RuntimeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -r -t 0");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	System.out.println("Available Process" + Runtime.getRuntime().availableProcessors());

	}

}
