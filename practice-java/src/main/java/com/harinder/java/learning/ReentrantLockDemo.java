package com.harinder.java.learning;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

	/**
	 * @param args 	
	 */
	public static void main(String[] args) {
		ReentrantLock l = new ReentrantLock();
		l.lock();
		l.lock();
		System.out.println("hold count = " + l.getHoldCount());
		System.out.println("queue length = " + l.getQueueLength());
		System.out.println("islocked = " + l.isLocked());
		l.unlock();
		System.out.println("hold count after releasing one lock = " + l.getHoldCount());
		System.out.println("fairnes policy = " + l.isFair());
		System.out.println("is held by current thread = " + l.isHeldByCurrentThread());
		l.unlock();
		System.out.println("islocked after unlock twice= " + l.isLocked());
		
		
	}

}
