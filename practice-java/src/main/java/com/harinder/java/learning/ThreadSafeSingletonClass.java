package com.harinder.java.learning;

public class ThreadSafeSingletonClass {
	private static ThreadSafeSingletonClass obj= null;
	private ThreadSafeSingletonClass() {}
	
	public static ThreadSafeSingletonClass getInstance() {
		if (obj == null) {
			synchronized(ThreadSafeSingletonClass.class) {
				if (obj == null) {
					obj = new ThreadSafeSingletonClass();
				}
			}
		}
		return obj;
	}
}
