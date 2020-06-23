package com.harinder.huawei;

import java.util.Arrays;

public class RowAndColSum {
	public static void findSum(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[] rowSum = new int[rows];
		int[] colSum = new int[cols];
		
		Arrays.fill(rowSum, 0);
		Arrays.fill(colSum, 0);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				rowSum[i] = rowSum[i] + matrix[i][j];
			}
		}
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				colSum[i] = colSum[i] + matrix[j][i];
			}
		}

		System.out.println("row sum : " + Arrays.toString(rowSum));
		System.out.println("col sum : " + Arrays.toString(colSum));

	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3}, {4,5,6}};
		RowAndColSum.findSum(matrix);
	}
}
