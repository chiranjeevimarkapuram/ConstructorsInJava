package com.arrays;

import java.util.Scanner;

//creating an 2D Array With Console based inputs
public class TestArr3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows size:");
		int rows = sc.nextInt();// 3

		System.out.println("Enter Columns size:");
		int col = sc.nextInt();

		int[][] numbers = new int[rows][col];

		System.out.println("Enter " + rows + "*" + col);// 3

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + "  ");
			}
			System.out.println();
		}

		sc.close();

	}

}
