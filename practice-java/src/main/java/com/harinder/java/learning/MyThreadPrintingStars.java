package com.harinder.java.learning;

public class MyThreadPrintingStars implements Runnable {

	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*");
	}

}
