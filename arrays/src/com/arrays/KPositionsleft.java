package com.arrays;

import java.util.Arrays;

public class KPositionsleft {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		int n = arr.length;
		k = k % arr.length;
		int result[] = new int[n];
		int index = 0;
		System.out.print("{");
		for (int i = k; i < n; i++) {
			result[index++] = arr[i];
		}
		for (int i = 0; i < k; i++) {
			result[index++] = arr[i];
		}
//		System.out.print(Arrays.toString(result));

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			if (i < result.length - 1) {
				System.out.print(" , ");
			}
		}

		System.out.print(" }");
	}

}
