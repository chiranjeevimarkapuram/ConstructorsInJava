package com.arrays;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5 };
		int[] arr1 = { 2, 4, 6 };
		int[] result = new int[arr.length + arr1.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			result[k++] = arr[i];
		}
		for (int j = 0; j < arr1.length; j++) {
			result[k++] = arr1[j];
		}
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}

}
