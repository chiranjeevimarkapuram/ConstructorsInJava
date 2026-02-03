package com.arrays;

import java.util.Scanner;

public class MaxElementInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter array Elements into an Array based on size:" + size);
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Entered Numbers is..!");
		for (int n : array) {
			System.out.print(n + "  ");
		}
		System.out.println();
		
		
		System.out.println("Finding max element in an Array..!");
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Maximum element in Array is:" + max);

		sc.close();

	}

}
