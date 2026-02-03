package com.arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Array Size:");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter Array Numbers based on your array size:" + size);
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Before sorting ..!");

		for (int n : array) {
			System.out.print(n + "  ");
		}
		System.out.println();

		int temp = 0;
		int count = 0;
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					flag = true;
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				//count++; // using count for How many rotation are done in " j for loop"
			}
			if (!flag) {
				System.out.println("Array is Already Sorted ..!");
				break;
			}
			 //count++; //Array is not sorted count using count for How many rotation are done in " i for loop"
			 //here,Array is already sorted count value=0 
			
		}

//		System.out.println(count);
		System.out.println("After Sorting..");
		for (int n1 : array) {
			System.out.print(n1 + " ");
		}
		System.out.println();
		sc.close();
	}

}
