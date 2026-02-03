package com.arrays;

import java.util.Scanner;

public class MinimunElement1D {

	public static void main(String[] args) {
		System.out.println("Main Method Started ..!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of An Array:");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter Element into an Array Based on size:" + size);
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Entered numbers are:");
		for (int n : array) {
			System.out.println(n + "  ");
		}
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Minimum number in an Array is:>" + min);

		sc.close();

	}

}
