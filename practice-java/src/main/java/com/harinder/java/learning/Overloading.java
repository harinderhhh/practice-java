package com.harinder.java.learning;

abstract class Number{
	void add(int a, int b)
	{
		int sum = a + b;
		System.out.println("Sum 2 = " + sum);
	}
	
	void add(int a, int b, int c)
	{
		int sum = a + b + c;
		System.out.println("Sum 3 = " + sum);
	}
	abstract void add(double a, double b, double c);
	}

class SmallNumber extends Number {
	void add(double a, double b, double c)
	{
		double sum = a + b + c;
		System.out.println("Sum double = " + sum);
	}
}
public class Overloading{
	public static void main(String args[])
	{
		Number n = new SmallNumber();
		n.add(10, 20);
		n.add(12, 13, 14);
		n.add(10.5, 20.5, 30.0);
		
	}
}