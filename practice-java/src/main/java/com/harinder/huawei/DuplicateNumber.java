package com.harinder.huawei;

import java.util.*;

class DuplicateNumber {

	static int findRepeating(int arr[], int n) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			if (s.contains(arr[i]))
				return arr[i];
			s.add(arr[i]);
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 9, 8, 2, 6, 1, 88, 55, 3, 55, 4, 7 };
		int n = arr.length;
		System.out.println(findRepeating(arr, n));
		;
	}
}
