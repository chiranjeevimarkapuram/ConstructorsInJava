package com.arrays;
//sorting an array Without using any Algorithm

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 5, 8, 3 };
		Arrays.sort(arr);
		for (int n : arr)
			System.out.print(n+" ");
	}
}
