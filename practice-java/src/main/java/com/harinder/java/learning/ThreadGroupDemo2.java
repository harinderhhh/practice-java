package com.harinder.java.learning;

class MyThread extends Thread
{
	MyThread(ThreadGroup g, String name)
	{
		super(g,name);
	}
	public void run()
	{
		System.out.println("Child Thread");
		try
		{
			sleep(5000);
		}
		catch (InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
public class ThreadGroupDemo2 {
    
	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		/*ThreadGroup pg = new ThreadGroup("parent group");
	    ThreadGroup cg = new ThreadGroup(pg, "child group");
	    MyThread t1 = new MyThread(pg, "thread1");
	    MyThread t2 = new MyThread(pg, "thread2");
	    t1.start();
	    t2.start();
	    System.out.println(pg.activeCount());
	    System.out.println(pg.activeGroupCount());
	    pg.list();
	    Thread.sleep(10000);
	    System.out.println(pg.activeCount());
	    System.out.println(pg.activeGroupCount());
	    pg.list();*/
		Thread.currentThread().getThreadGroup().getParent().list();
		ThreadGroup systemGroup = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[systemGroup.activeCount()];
		systemGroup.enumerate(t);
		for(Thread i:t)
		{
			System.out.println(i.getName() + "----" + i.isDaemon());
		}
		
	}

}
