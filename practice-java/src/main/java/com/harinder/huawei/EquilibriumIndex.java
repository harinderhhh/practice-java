package com.harinder.huawei;

public class EquilibriumIndex {
	
	public static void main(String[] args) {
		int[] arr = {-1, 3, -4, 5, 1, -6, 2, 1};
		System.out.println("Equilibrium Point: " + findEquilibriumIndex(arr));
	}

	static int findEquilibriumIndex(int[] arr) {
		int sumTotal = 0;
		for (int i = 0; i < arr.length; i++) {
			sumTotal += arr[i];
			System.out.println("Total = " + sumTotal);
		}
		int leftSum = 0;
		for (int i = 0; i < arr.length; ++i) {
			sumTotal = sumTotal - arr[i];
			if (leftSum == sumTotal) {
				return i;
			}
			leftSum = leftSum + arr[i];
		}
		return -1;
	}
}