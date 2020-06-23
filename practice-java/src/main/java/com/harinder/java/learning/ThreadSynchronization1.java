package com.harinder.java.learning;

class Displayc{
	public synchronized void displayn()
	{
		for(int i=0; i < 10; i++)
		{
		System.out.print(i);
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		}
	}

	public synchronized void displayc()
	{
		for(int i=65; i < 75; i++)
		{
		System.out.print((char)i);
		/*try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}*/
		}
	}
}

class MyThread1 extends Thread
{
	Displayc d;
		
	public MyThread1(Displayc d) {
		this.d = d;
	}
	
	public void run() {
		d.displayn();
	}
}
class MyThread2 extends Thread
{
	Displayc d;
	public MyThread2(Displayc d) {
		this.d = d;
	}
	public void run() {
		d.displayc();
	}
}

public class ThreadSynchronization1{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Displayc d = new Displayc();
		MyThread1 ts1 = new MyThread1(d);
		MyThread2 ts2 = new MyThread2(d);
		/*Thread t1 = new Thread(ts1);
		Thread t2 = new Thread(ts2);*/
		ts1.start();
		ts2.start();
		System.out.println(ts1.getThreadGroup().getName());
		System.out.println(ts1.getThreadGroup().getParent().getName());
		
	}
}
