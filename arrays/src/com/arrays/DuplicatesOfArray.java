package com.arrays;

public class DuplicatesOfArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 5, 5, 1 };
		int D = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicates number:" + arr[j]);
				}
			}

		}

	}

}
