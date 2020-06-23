package com.harinder.java.learning;

public class ThreadLifeCycle implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadLifeCycle tls = new ThreadLifeCycle();
		Thread t = new Thread(tls);
		t.start();
		Thread.currentThread().setPriority(1);
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Main Thread!!");
		}
	}

	public void run() {
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Child Thread!!");
			Thread.yield();
		}
	}

}
