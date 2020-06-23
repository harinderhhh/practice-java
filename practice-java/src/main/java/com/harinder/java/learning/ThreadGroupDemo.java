package com.harinder.java.learning;

import java.util.concurrent.locks.Lock;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		//Lock
		ThreadGroup systemGroup = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[systemGroup.activeCount()];
		systemGroup.enumerate(t);
		for (Thread i : t)
		{
			System.out.println(i.getName() + "---" + i.isDaemon());
		}
	}

}
