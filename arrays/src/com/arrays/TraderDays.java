package com.arrays;

public class TraderDays {

	public static void main(String[] args) {
		int[] a = { 10, 5, 11, 1, 19, 27, 13 };
		
		String[] s= {};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
		System.out.println(max);

	}

}
