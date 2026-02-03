package com.arrays;

public class ReverseOfArray {

	public static void main(String[] args) {
		System.out.println("Main Method Started ..!");
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
