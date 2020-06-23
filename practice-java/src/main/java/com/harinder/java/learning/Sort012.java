package com.harinder.java.learning;

import java.util.Arrays;

//Given an array of integers containing only 0, 1 and 2. 
//Output should be sorted in increasing order. (Do not use sort()). Try to give 2 or more approach.
public class Sort012 {
	public static void main(String[] args) {
		int[] arr = new int[] {2,1,0,2,1,2,2,1,1,0,0,1,2,2,2,0,0,2,1,1,0};
		sort012(arr);
	}
	private static void sort012(int[] arr) {
		int len = arr.length;
		int[] freq = {0,0,0};
		for (int i = 0; i < len; i++) {
			if (arr[i] == 0) {
				freq[0]++;
			} else if (arr[i] == 1) {
				freq[1]++;
			} else if (arr[i] == 2) {
				freq[2]++;
			}
		}
		int[] sortedArr = new int[len];
		Arrays.fill(sortedArr, 0, freq[0] - 1, 0);
		Arrays.fill(sortedArr, freq[0], freq[0] + freq[1], 1);
		Arrays.fill(sortedArr, freq[0] + freq[1], len, 2);
		System.out.println(Arrays.toString(sortedArr));
	}
}
