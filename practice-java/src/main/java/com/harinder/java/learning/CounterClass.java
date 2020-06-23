package com.harinder.java.learning;

import java.util.HashMap;
import java.util.Map;

public class CounterClass {
	private static void counter(char[] arr) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			Character ch = arr[i];
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		boolean found = false;
		char firstNonRepetiveChar = ' ';
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			if (found == false && (Integer) entry.getValue() == 1) {
				firstNonRepetiveChar = (Character) entry.getKey();
				found = true;
			}
		}
		if (found = true) {
			System.out.println("First Non Repetitive Character: " + firstNonRepetiveChar);
		}

	}

	public static void main(String[] args) {
		char[] str = { 'H', 'a', 'r', 'i', 'n', 'd', 'e', 'r', 'S', 'i', 'n', 'g', 'h' };
		counter(str);
	}
}
