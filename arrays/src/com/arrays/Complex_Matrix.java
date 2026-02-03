package com.arrays;

import java.util.Scanner;

public class Complex_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rows Size :");
		int a = sc.nextInt();
		System.out.println("Enter cols size:");
		int b = sc.nextInt();
		int[][] matrix = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		for (int[] n1 : matrix) {
			for (int n : n1) {
				System.out.print(n + "  ");
			}
			System.out.println();
		}

		System.out.println("---------------------"
				+ "");
		int p = 1; // for product values
		for (int i = 0; i < matrix.length; i++) {

			if (i % 2 == 0) {

				for (int j = 0; j < matrix[i].length; j++) {

					p *= matrix[i][j];

				}
				System.out.println(p);
			}
		}
		for (int[] n1 : matrix) {
			for (int n : n1) {
				System.out.print(n + "  ");
			}
			System.out.println();
		}
	}

}
