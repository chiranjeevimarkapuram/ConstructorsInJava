package com.arrays;

public class LongestSubArray {

	public static void main(String[] args) {

		int[] a = { 1, 0, 0, 1, 1, 0, 1, 1 };
		int max = 0;
		int s = 0;
		int e = 0;
		for (int i = 0; i < a.length; i++) {
			int z = 0;
			int one = 0;
			for (int j = i; j < a.length; j++) {
				if (a[i] == 0) {
					z++;
				} else {
					one++;
				}
				if (z == one) {
					int length = j - i + 1;
					for (int x = s; i < length; i++) {
						System.out.println(a[s]);
					}
				}
			}
		}
	}
}
