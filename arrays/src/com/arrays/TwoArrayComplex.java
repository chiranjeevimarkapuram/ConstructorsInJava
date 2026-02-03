package com.arrays;

//	  j  j  j  j	
//i==>1  2   3 4  -->reverse 
//5  6   7 8          -->after reverse diagonal **square  
//9  10 11 12 -->reverse
//13 14 15 16 
public class TwoArrayComplex {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
//		for (int[] a2 : a) {
//			for (int a1 : a2) {
//				System.out.print(a1 + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j >= 0; j--) {
				for (int k = 0; k < a.length; k++) {
					if (i % 2 == 0) {
						System.out.print(a[i][j] + " ");
						break; // fix
					} else {
						System.out.print(a[i][k] + " ");
//						continue;
					}
				}

			}
			System.out.println();
		}

//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				if (a[i][j] == a[j][i]) {
//					System.out.print((a[i][j]) * (a[i][j]) + " ");
//				}
//			}
//			System.out.println();
//		}

	}

}
