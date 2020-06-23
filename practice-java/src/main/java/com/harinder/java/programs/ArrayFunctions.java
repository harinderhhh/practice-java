package com.harinder.java.programs;

import java.util.HashMap;
import java.util.Map;

public class ArrayFunctions {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 22, 5 , 5, 2,88, 6, 8, 4, 78, 22, 8 , 6, 88, 54,8,12};
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		ArrayFunctions arrFunc = new ArrayFunctions();
		arrFunc.copyArray(arr);
		countFreq(arr, mp);
		printDuplicates(mp);
		arrFunc.printLargestElement(arr);
		printSmallestElement(arr);
		printSize(arr);
		leftRotate(arr, 2);
		printArray(arr);
		rightRotate(arr, 2);
		printArray(arr);
		findEquilibriumIndex(arr);
		
	}

	private static void findEquilibriumIndex(int[] arr) {
		int sumTotal = 0;
		for (int i = 0; i < arr.length; i++) {
			sumTotal += arr[i];
		}
		int leftSum = 0, found = 0;
		for (int i = 0; i < arr.length; i++) {
			leftSum = sumTotal - arr[i];
			if (leftSum == sumTotal - leftSum) {
				System.out.println("Equilibrium Point = " + i);
				found = 1;
			}
		}
		if(found == 0) {
			System.out.println("No Equilibrium point in array..");
		}
	}
	
	private static void printDuplicates(Map<Integer, Integer> mp) {
		for(Integer key: mp.keySet()) {
			if (mp.get(key) > 1) {
				System.out.println("Duplicates: " + key);
			}
		}
	}

	public static void printArray(int arr[]) 
    { 
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " "); 
    } 
	
	public int[] copyArray(int[] arr) {
		int[] copiedArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copiedArray[i] = arr[i];
		}
		return copiedArray;
	}

	public static void countFreq(int arr[], Map<Integer, Integer> mp) { 
        for (int i = 0; i < arr.length; i++) { 
            if (mp.containsKey(arr[i])) { 
                mp.put(arr[i], mp.get(arr[i]) + 1); 
            }  
            else { 
                mp.put(arr[i], 1); 
            } 
        }
        System.out.println("Value and Frequency");
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
    } 
	
	//left rotate the elements of an array
	public static int[] leftRotate(int arr[], int d) 
    { 
        for (int i = 0; i < d; i++) 
            leftRotatebyOne(arr);
        return arr;
    } 
  
    private static void leftRotatebyOne(int arr[]) 
    { 
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < arr.length - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
        
    } 
	
	//right rotate the elements of an array
    public static void rightRotate(int arr[], int d) 
    { 
        for (int i = 0; i < d; i++) 
            rightRotatebyOne(arr); 
    } 
  
    private static void rightRotatebyOne(int arr[]) 
    { 
        int i, temp; 
        temp = arr[arr.length - 1]; 
        for (i = arr.length - 1; i > 0; i--) 
            arr[i] = arr[i - 1]; 
        arr[i] = temp; 
        
    } 
	
	
	//print the largest element in an array
	public Integer printLargestElement(int[] arr) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) { 
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
		return largest;
	}
	
	//print the smallest element in an array
	public static void printSmallestElement(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) { 
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println(smallest);
	}
	
	//print the number of elements present in an array
	public static void printSize(int[] arr) {
		System.out.println(arr.length);
	}
	
	//print the sum of all the items of the array
	public static void printSumOfArray(int[] arr) {
		int sumOfArray = 0;
		for (int i = 0; i < arr.length; i++) { 
			sumOfArray = sumOfArray + arr[i];
		}
		System.out.println(sumOfArray);
	}
	
	//sort the elements of an array in ascending order
	public static void sortInAscendingOrder(int[] arr) {
		for (int i = 0; i < arr.length; i++) { 
		}
		System.out.println();
	}
	
	//sort the elements of an array in descending order
	public static void sortInDescendingOrder(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
		}
		System.out.println();
	}

	//Find 3rd Largest Number in an array
	public static void thirdLargestNumber(int[] arr) {
		int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				third = second;
				second = arr[i];
			} else if (arr[i] > third) {
				third = arr[i];
			}
		}
		System.out.println("Third largest number: " + third);
	}
	
	//Find 2nd Largest Number in an array
	public static void secondLargestNumber(int[] arr) {
		int first = arr[0], second = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				second = arr[i];
			}
		}
		System.out.println("Second largest number: " + second);
	}
}



