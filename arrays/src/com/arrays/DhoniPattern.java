package com.arrays;

public class DhoniPattern {

	public static void main(String[] args) {
//		char Lalp = 'a';
//		char[] a = { 'D', 'H', 'O', 'N', 'I' };
//		int n = a.length;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				if (i == j || j == n - i - 1) {
//					System.out.print(a[i] + " ");
//				} else {
//					System.out.print(Lalp + " ");
//					Lalp++;
//				}
//			}
//			System.out.println();
//		}
		
		
		
		char Lalp = 'a';
		String a ="DHONI";
		int n = a.length();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || j == n - i - 1) {
					System.out.print(a.charAt(i) + " ");
				} else {
					System.out.print(Lalp + " ");
					Lalp++;
				}
			}
			System.out.println();
		}
	}
}
