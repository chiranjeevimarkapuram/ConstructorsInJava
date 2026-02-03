package com.arrays;

public class AppendZerosLast {

	public static void main(String[] args) {
		int[] a = { 0, 2, 5, 0, 3, 0, 21, 9, 0, 2 };

		int temp = 0;

		for (int i = 0; i < a.length; i++) {
//			for (int j = a.length - 1; j >= 0; j--) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i] == 0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int a1 : a) {
			System.out.print(a1 + " ");
		}
	}

}
