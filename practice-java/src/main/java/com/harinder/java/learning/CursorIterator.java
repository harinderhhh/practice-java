package com.harinder.java.learning;

import java.util.ArrayList;
import java.util.Iterator;

//Program to parse ArrayList using Iterator and remove odd numbers
public class CursorIterator {
	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			al.add(i);
		}
		System.out.println(al);
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer element = (Integer) itr.next();
			if (element % 2 != 0)
				itr.remove();
		}
		System.out.println(al);
	}
}