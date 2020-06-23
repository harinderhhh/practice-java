package com.harinder.huawei;

import java.util.Arrays;

public class DuplicateCharacters {
	static void printDuplicateCharacters(char[] S) {
		int[] frequency = new int[26];
		Arrays.fill(frequency, 0, 25, 0);
		for (int i = 0; i < S.length; ++i) {
			char ch = Character.toLowerCase(S[i]);
			if (ch >= 97 && ch <= 122) {
				int index = findIndex(ch);
				frequency[index]++;
			}
		}
		System.out.println("Duplicate Characters in String:");
		for (int i = 0; i < 26; ++i)
			if (frequency[i] > 1) {
				System.out.println((char) (i + 'a'));
			}
	}

	static int findIndex(char c) {
		return (c - 'a');
	}

	public static void main(String[] args) {
		String str = "Harinder Singh";
		printDuplicateCharacters(str.toCharArray());
	}
}
