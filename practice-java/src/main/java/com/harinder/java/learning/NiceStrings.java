package com.harinder.java.learning;

import java.util.Scanner;

public class NiceStrings {
	private static char[][] arr;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of the input array:");
		int size = scanner.nextInt();
		System.out.println("Enter " + size + " input characters:");
		arr = new char[size][size];
		for(int i = 0; i < size; i++) {
			arr[i][i] = scanner.next().charAt(0);
		}
		scanner.close();
		findNiceValue();
	}

	private static void findNiceValue() {
		
		int[] frequency = new int[arr.length];
		for (int i= 0; i < frequency.length; i++) {
		}
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >=0; j--) {
				if (arr[j][j] < arr[i][i]) {
					frequency[i]++;
				}
			}
		}
		for (int i= 0; i < frequency.length; i++) {
			System.out.println(frequency[i]);
		}
	}

}
