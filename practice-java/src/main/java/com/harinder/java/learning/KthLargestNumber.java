package com.harinder.java.learning;

public class KthLargestNumber {
	public static void main(String[] args) {
		int arr[] = { 3, 6, 3, 7, 8, 11, 44, 7, 88, 99, 83, 45, 10 };
		int arr_len = arr.length;
		int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE, fourth = Integer.MIN_VALUE,
				fifth = Integer.MIN_VALUE;
		for (int i = 1; i < arr_len; i++) {
			if (arr[i] > first) {
				fifth = fourth;
				fourth = third;
				third = second;
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				fifth = fourth;
				fourth = third;
				third = second;
				second = arr[i];
			} else if (arr[i] > third) {
				fifth = fourth;
				fourth = third;
				third = arr[i];
			} else if (arr[i] > fourth) {
				fifth = fourth;
				fourth = arr[i];
			} else if (arr[i] > fifth) {
				fifth = arr[i];
			}
		}

		System.out.println("Fifth Largest number = " + fifth);
	}
}
