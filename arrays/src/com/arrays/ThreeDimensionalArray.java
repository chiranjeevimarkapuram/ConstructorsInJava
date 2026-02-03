package com.arrays;

import java.util.Scanner;

//creating 3D array 
public class ThreeDimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][] numbers = new int[2][2][2];

//		numbers[0][0][0]=1;
//		numbers[0][0][1]=11;
//		numbers[0][1][0]=111;
//		numbers[0][1][1]=1111;
//		
//		numbers[1][0][0]=2;
//		numbers[1][0][1]=22;
//		numbers[1][1][0]=222;
//		numbers[1][1][1]=2222;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				for (int k = 0; k < numbers[j].length; k++) {
//					System.out.print(numbers[i][j][k] + "  ");
					numbers[i][j][k] = sc.nextInt();
				}

			}
			System.out.println();
		}
		for (int[][] n : numbers) {
			for (int[] n1 : n) {
				for (int n2 : n1) {
					System.out.print(n2 + " ");
				}

			}
		}

		for (int[][] n1 : numbers) {
			for (int[] n2 : n1) {
				for (int n3 : n2) {
					System.out.print(n3 + "  ");
				}
			}
			System.out.println();
		}

	}

}

//	    public static void main(String[] args) {
//
//	        Scanner sc = new Scanner(System.in);
//
//	        System.out.println("Enter number of matrices (layers): ");
//	        int x = sc.nextInt();
//
//	        System.out.println("Enter number of rows: ");
//	        int y = sc.nextInt();
//
//	        System.out.println("Enter number of columns: ");
//	        int z = sc.nextInt();
//
//	        int[][][] arr = new int[x][y][z];
//
//	        System.out.println("Enter " + (x * y * z) + " values:");
//
//	        // Storing values
//	        for (int i = 0; i < x; i++) {
//	            System.out.println("Matrix " + (i + 1) + ":");
//	            for (int j = 0; j < y; j++) {
//	                for (int k = 0; k < z; k++) {
//	                    arr[i][j][k] = sc.nextInt();
//	                }
//	            }
//	        }
//
//	        // Printing values
//	        System.out.println("\n3D Array elements:");
//	        for (int i = 0; i < x; i++) {
//	            System.out.println("Matrix " + (i + 1) + ":");
//	            for (int j = 0; j < y; j++) {
//	                for (int k = 0; k < z; k++) {
//	                    System.out.print(arr[i][j][k] + " ");
//	                }
//	                System.out.println();
//	            }
//	            System.out.println();
//	        }
//
//	        sc.close();
//	    }
//	}
