package com.harinder.java.learning;

public class ThreadCaseStudy2 implements Runnable{

	public void run()
	{
		for(int i=0; i < 10; i++)
		{
		//System.out.println("ThreadCaseStudy run(). ID = " + Thread.currentThread().getName());
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				System.out.println("Exception: " + e.getMessage());
			}
		}
		//Thread.currentThread().setName("newThread");
		//System.out.println("ThreadCaseStudy run(). ID is changed= " + Thread.currentThread().getName());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println("main(). ID = " + Thread.currentThread().getName());
		ThreadCaseStudy2 tcs = new ThreadCaseStudy2();
		//Thread.currentThread().setPriority(4);
		Thread t1 = new Thread(tcs, "t1");
		//Thread.currentThread().setPriority(10);
		//t1.setPriority(10);
		t1.start();
		try
		{
			t1.join(10000);
		}
		catch (InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		for(int i=0; i < 10; i++)
		{
			System.out.println("Main Thread");
		}
	}

}
