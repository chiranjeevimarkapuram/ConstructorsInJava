package com.arrays;

public class SearchingArrayLinear {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 7, 8 };

		int ls = 11;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ls) {
				System.out.println("Element  " + ls + " found at index  " + i);
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println("Element not in an array");
		}

	}

}
