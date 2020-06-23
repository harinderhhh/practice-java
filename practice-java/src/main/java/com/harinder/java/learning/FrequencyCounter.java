package com.harinder.java.learning;

import java.util.Arrays;

public class FrequencyCounter {
	public static void main(String[] args) {
		char[] str = { 'H', 'a', 'r', 'i', 'n', 'd', 'e', 'r', 'S', 'i', 'n', 'g', 'h' };
		countFrequency(str);
	}

	static int findIndex(char c) {
		return (Character.toLowerCase(c) - 'a');
	}

	static void countFrequency(char[] S) {
		int[] frequency = new int[26];
		Arrays.fill(frequency, 0, 25, 0);
		//frequency.length = 10;
		for (int i = 0; i < S.length; ++i) {
			int index = findIndex(S[i]);
			frequency[index]++;
		}
		for (int i = 0; i < 26; ++i)
			if (frequency[i] != 0)
				System.out.println((char) (i + 'a') + " " + frequency[i]);
	}
}