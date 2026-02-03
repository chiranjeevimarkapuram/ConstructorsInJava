package com.arrays;

//printing whole missing numbers in an array 
public class MissingNums {

	public static void main(String[] args) {
		int[] num = { 5, 8, 1, 3, 11 ,0,99};
		System.out.println("Actual Array:");
		for (int n : num) {
			System.out.print(n + "  ");
		}

		System.out.println();
		int max = 0;
		int min = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}

		}
		// System.out.println("max number is :" + max);

		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		// System.out.println("minimum number in an array:" + min);

		System.out.println("Missing numbers :");
		for (int i = min; i <= max; i++) {
			boolean flag = false;
			for (int n : num) {
				if (i == n) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.print(i + "  ");
			}
		}
	}

}
