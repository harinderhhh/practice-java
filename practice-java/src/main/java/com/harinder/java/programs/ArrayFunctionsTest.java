package com.harinder.java.programs;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;


public class ArrayFunctionsTest {
	int[] arr = { 1, 3, 5, 2, 6, 8, 4, 78, 22, 9, 5 };

	@Test
	public void testMain() {
		
	}

	@Test
	public void testCopyArray() {
		int[] arrCopied = { 1, 3, 5, 2, 6, 8, 4, 78, 22, 9, 5 };
		ArrayFunctions arrayFunctions = new ArrayFunctions();
		assertArrayEquals(arrCopied, arrayFunctions.copyArray(arr));
	}

	@Test
	public void testCountFreq() {
		ArrayFunctions arrayFunctions = new ArrayFunctions();
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		mp.put(1, 1);
		mp.put(3, 1);
		mp.put(5, 2);
		mp.put(2, 1);
		mp.put(6, 1);
		mp.put(8, 1);
		mp.put(4, 1);
		mp.put(78, 1);
		mp.put(22, 1);
		mp.put(9, 1);
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		ArrayFunctions.countFreq(arr, resultMap);
		assertEquals(mp.entrySet(), resultMap.entrySet());
	}

	@Test
	public void testLeftRotate() {
		int[] resultArr = { 5, 2, 6, 8, 4, 78, 22, 9, 5, 1, 3 };
		assertArrayEquals(resultArr, ArrayFunctions.leftRotate(arr, 2));
	}

	@Test
	public void testPrintLargestElement() {
		Integer largestNumber =  78;
		ArrayFunctions arrayFunctions = new ArrayFunctions();
		assertEquals(largestNumber, arrayFunctions.printLargestElement(arr));
	}

	@Test
	public void testPrintSmallestElement() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintSumOfArray() {
		
	}

	@Test
	public void testSortInAscendingOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testSortInDescendingOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testThirdLargestNumber() {
		fail("Not yet implemented");
	}

	@Test
	public void testSecondLargestNumber() {
		fail("Not yet implemented");
	}

}
