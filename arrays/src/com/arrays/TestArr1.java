package com.arrays;

//creating a 2D array
public class TestArr1 {
	public static void main(String[] agrs) {
		int[][] numbers = new int[3][3];
//		[i]-->rows && [j]-->cols
		numbers[0][0] = 100;
		numbers[1][1] = 200;
		numbers[2][2] = 300;

//		using for each loop into print 2D array
//		Intially converting 2D --> 1D -->Normal array
//		for (int[] n : numbers) {
//			for (int n1 : n) {
//				System.out.print(n1 + "  ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
