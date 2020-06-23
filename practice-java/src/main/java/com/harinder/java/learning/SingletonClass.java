package com.harinder.java.learning;

public class SingletonClass {
	private static SingletonClass obj = new SingletonClass();
	
	private SingletonClass() {
	}
	
	public static SingletonClass getInstance() {
		return obj;
	}
}
