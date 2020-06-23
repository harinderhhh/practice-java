package com.harinder.huawei;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		doLinearSearch(arr, 22);
	}

	static void doLinearSearch(int[] arr, int val) {
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (val == arr[i]) {
				found = true;
				System.out.println("Found value " + val + " at index " + i);
			}
		}
		if (!found) {
			System.out.println("Value not found in the array!!");
		}
	}

}
