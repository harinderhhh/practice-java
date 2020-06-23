package com.harinder.huawei;

public class SelectionSort {

	public void doSelectionSort(int[] arr) {
		int temp, len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < len; j++) {
				if (arr[minIndex] > arr[j])
					minIndex = j;

			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		SelectionSort ss = new SelectionSort();
		ss.doSelectionSort(arr);
		ss.printArray(arr);
	}

}
