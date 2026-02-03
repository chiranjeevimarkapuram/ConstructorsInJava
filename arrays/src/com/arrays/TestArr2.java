package com.arrays;

import java.util.Scanner;

//creating an 1D Array With Console based inputs
public class TestArr2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size:");
		int size = sc.nextInt();
		System.out.println("Enter Array values based on size" + size);
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("Representation of an Array");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
		}
		sc.close();
	}

}
