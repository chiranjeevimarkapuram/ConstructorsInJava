package com.arrays;

import java.util.Scanner;

public class JuggedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rows Size : ");
		int rows = sc.nextInt();

		int[][] array = new int[rows][];

//		System.out.println("Enter Values in an array based on cols size is :" + cols + " rows size is : " + rows);

		for (int i = 0; i < rows; i++) {
			System.out.println("Enter no of Columns for row:");

			int cols = sc.nextInt();
			System.out.println("Enter Values:"
					);
			
			array[i] = new int[cols];
			for (int j = 0; j < cols; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println();

		System.out.println("Array Representation :");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
