package com.collections;

public class PatternPrinting {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			char c = 'A';
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print(c);
				if (k < i) {
					c++;
				} else {
					c--;
				}
			}
			System.out.println();
		}
	}
}
