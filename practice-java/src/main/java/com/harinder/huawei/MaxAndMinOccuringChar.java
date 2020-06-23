package com.harinder.huawei;

import java.util.Arrays;

public class MaxAndMinOccuringChar {
	static void findMinAndMaxRepeatedChar(char[] S) {
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
		int minIndex = 0, maxIndex = 0;
		for (int i = 0; i < 26; ++i) {
			if (frequency[i] > 0 && frequency[i] >= frequency[maxIndex]) {
				maxIndex = i;
			}
			if (frequency[i] > 0 && frequency[i] <= frequency[minIndex]) {
				minIndex = i;
			}
		}
		
		System.out.println("Minimum repeated character: " + (char) (minIndex + 'a'));
		System.out.println("Maximum repeated character: " + (char) (maxIndex + 'a'));
	}

	static int findIndex(char c) {
		return (c - 'a');
	}

	public static void main(String[] args) {
		String str = "Haarindeer Ssinnghhh";
		MaxAndMinOccuringChar.findMinAndMaxRepeatedChar(str.toCharArray());
	}

}
