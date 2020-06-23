package com.harinder.java.learning;

import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len;
		int arr[];
		if (scanner.hasNext()) {
			len = scanner.nextInt();
			arr = new int[len];
			for (int i = 0; i < len; i++) {
				arr[i] = scanner.nextInt();
			}
			findMinMaxSum(arr);
		}
		scanner.close();
	}

	private static void findMinMaxSum(int[] arr) {
		int sum = 0, maxNum = Integer.MIN_VALUE, minNum = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			} 
			if (minNum > arr[i]) {
				minNum = arr[i];
			}
		}
		System.out.println((sum-maxNum) + " " + (sum-minNum));
	}
}
