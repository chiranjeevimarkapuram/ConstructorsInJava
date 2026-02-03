package com.arrays;

import java.util.Scanner;

//transpose matrix or Array 90degree rotation 
public class TransposeMatrix2D {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int n = a.length;
		System.out.println(n);
		for (int k = 0; k < a.length; k++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j][k] + "  ");
			}
			System.out.println();
		}

		System.out.println("---------------------");
		for (int i = 0; i < a.length; i++) {
			for (int c = 0; c < a[i].length; c++) {
				System.out.print(a[n - 1 - c][i] + " ");
			}
			System.out.println();
		}
//		Excepted output:
//		7  4  1  
//		8  5  2  
//		9  6  3

	}

}
