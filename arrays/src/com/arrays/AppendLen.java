package com.arrays;

public class AppendLen {

	public static void main(String[] args) {
		int[] a = { 12, 123, 1571, 21523 };
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			int count = 0;
			while (n != 0) {
				n = n / 10;
				count += 1;
			}
			a[i]=a[i]*10+count;
		}
		for(int aa:a) {
			System.out.print(aa+" ");
		}

	}
}
