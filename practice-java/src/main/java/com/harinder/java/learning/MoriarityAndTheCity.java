package com.harinder.java.learning;

import java.util.Scanner;

public class MoriarityAndTheCity {
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
			findNumOfBlocks(arr);
		}
		scanner.close();
	}

	private static void findNumOfBlocks(int[] arr) {
		int count = 1, currentCount = 1; 
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == arr[i+1]) {
				currentCount++;
			} else {
				currentCount = 1;
			}
			if (count <= currentCount) {
				count = currentCount;
			}
		}
		System.out.println(count);
	}
}
