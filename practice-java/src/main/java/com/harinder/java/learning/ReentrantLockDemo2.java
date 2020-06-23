package com.harinder.java.learning;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo2 extends Thread{
    public ReentrantLockDemo2(String name) {
    	super(name);
	}
	static ReentrantLock l = new ReentrantLock();
	public void run()
	{
		do
		{
			try{
		    if (l.tryLock(1000,TimeUnit.MILLISECONDS))
		    {
		    	System.out.println(Thread.currentThread().getName() + " got the lock and performaing the operation.");
		    	Thread.sleep(5000);
		    	l.unlock();
		    	break;
		    }
		    else
		    {
		    	System.out.println(Thread.currentThread().getName() + " didn't get the lock, will try again.");
		    }
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		while(true);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReentrantLockDemo2 d1 = new ReentrantLockDemo2("first thread");
		ReentrantLockDemo2 d2 = new ReentrantLockDemo2("second thread");
		d1.start();
		d2.start();
		
		
		
	}

}
