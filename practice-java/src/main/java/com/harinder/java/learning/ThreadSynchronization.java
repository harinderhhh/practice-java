package com.harinder.java.learning;

class Display{
	public static synchronized void wish(String name)
	{
		for(int i=0; i < 10; i++)
		{
		System.out.print("Good Morning:");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(name);
		}
	}
}

public class ThreadSynchronization implements Runnable{
	Display d;
	String name;
	
	public ThreadSynchronization(Display d,String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		ThreadSynchronization ts1 = new ThreadSynchronization(d1, "Dhoni");
		ThreadSynchronization ts2 = new ThreadSynchronization(d2, "Yuvraj");
		Thread t1 = new Thread(ts1);
		Thread t2 = new Thread(ts2);
		t1.start();
		t2.start();
		
	}

}
