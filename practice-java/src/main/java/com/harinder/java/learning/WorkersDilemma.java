package com.harinder.java.learning;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
/*class AComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i1.compareTo(i2);
	}
	
}
class BComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i2.compareTo(i1);
	}
	
}*/
public class WorkersDilemma {
	private static Map<Integer, Integer> mapA = new TreeMap<Integer, Integer>();
	private static Map<Integer, Integer> mapB = new TreeMap<Integer, Integer>();
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {5,6,7,1,1};
		System.out.println(profit(5, arr1, arr2, 3, 3));
	}
	public static int profit(int input1, int[] input2, int[] input3, int input4, int input5)
	{
		if (input1 == input4)
		{
			return add(input2);
		}
		else if (input1 == input5)
		{
			return add(input3);
		}
		else if (input4 == input5)
		{
			for (int i = 0; i < input2.length ; i++)
			{
				mapA.put(i, input2[i]);
				mapB.put(i, input3[i]);
				if (mapA.get(i) >= mapB.get(i))
				{
					
				}
			}
			System.out.println(mapA);
			System.out.println(mapB);
			
			return 0;
			/*
			int[] arr = new int[input2.length];
			for (int i = 0; i < input2.length ; i++) //&& i < input3.length
			{
				if (input2[i] >= input3[i])
				{
					arr[i] = input2[i];
				}
				else
				{
					arr[i] = input3[i];
				}
				System.out.println(arr[i]);
			}
			return add(arr);
		*/}
		else
		{
			return 1111;
		}
	}

	private static int add(int[] input) {
		int sum = 0;
		for(int i = 0; i < input.length; i++)
		{
			sum = sum + input[i];
		}
		return sum;
	}
}
