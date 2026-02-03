package com.arrays;

public class SumOf2DArray {

	public static void main(String[] args) {
		int sum = 0;
		int[][] array = { { 1, 2 }, { 2, 3 } };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= array.length-1; j++) {
				sum += array[i][j];
			}
		}
		
		System.out.println(sum);
	}

}
