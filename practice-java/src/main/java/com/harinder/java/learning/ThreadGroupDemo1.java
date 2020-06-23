package com.harinder.java.learning;

public class ThreadGroupDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread.currentThread().getThreadGroup().setMaxPriority(8);
		System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority());
		ThreadGroup g = new ThreadGroup("First Group");
		Thread t1 = new Thread(g, "Thread1");
		
		Thread t2 = new Thread(g, "Thread2");
		g.setMaxPriority(7);
		Thread t3 = new Thread(g, "Thread3");
System.out.println(t1.getPriority());
System.out.println(t2.getPriority());
System.out.println(t3.getPriority());
g.list();
	}

}
