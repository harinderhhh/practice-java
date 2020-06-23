package com.harinder.java.learning;

class NewDisplay
{
	public void wish(String msg)
	{
		for(int i =0; i < 10; i++)
		{
		    System.out.println(msg + " from " + Thread.currentThread().getName());
		}
	}
}
public class ThreadWaitNotifyDemo extends Thread{
	String text;
	public ThreadWaitNotifyDemo(String text) {
		this.text = text;
	}
	NewDisplay d = new NewDisplay();
	public void run()
	{
		d.wish(this.text);
	}
	public static void main(String[] args) {
		ThreadWaitNotifyDemo t1 = new ThreadWaitNotifyDemo("harinder");
		ThreadWaitNotifyDemo t2 = new ThreadWaitNotifyDemo("durga");
		t1.start();
		t2.start();
		
		
	}

}
