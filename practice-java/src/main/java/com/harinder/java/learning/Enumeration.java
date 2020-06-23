package com.harinder.java.learning;

import java.util.Vector;

public class Enumeration {
	
	public static void main(String args[])
	{
		Vector<Integer> v = new Vector<Integer>();
		System.out.println(v.capacity());
		for(int i = 0; i < 10; i++)
		{
			v.add(i);	
		}
		System.out.println(v.capacity());
		v.add(10);
		System.out.println(v.capacity());
		java.util.Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
