package com.harinder.java.learning;

public class ThreadCaseStudy implements Runnable{

	public void run()
	{
		System.out.println("ThreadCaseStudy run(). ID = " + Thread.currentThread().getName());
		//Thread.currentThread().setName("newThread");
		//System.out.println("ThreadCaseStudy run(). ID is changed= " + Thread.currentThread().getName());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main(). ID = " + Thread.currentThread().getName());
		ThreadCaseStudy tcs = new ThreadCaseStudy();
		//Thread.currentThread().setPriority(4);
		Thread t1 = new Thread(tcs, "t1");
		Thread t2 = new Thread(tcs, "t2");
		Thread.currentThread().setPriority(4);
		System.out.println("Default Priority t1 = " + t1.getPriority());
		System.out.println("Default Priority t2 = " + t2.getPriority());
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		//t1.run();
		t2.start();
		//System.out.println("t2 name changed = " + t2.getName());
		//t2.run();
		//tcs.start();
		//tcs.run();

	}

}
