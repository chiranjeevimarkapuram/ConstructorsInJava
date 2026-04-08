package com.Preparation;

import java.util.Scanner;

public class ChocolateFactory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		for (int a1 : a) {
			System.out.print(a1 + " ");
		}
//		int temp = 0;
		////		0 10 0 2 0 3 0 0 5
//		System.out.println("after");
//		for (int i = 0; i < size; i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if (a[i] == 0) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//
//		for (int a1 : a) {
//			System.out.print(a1 + " ");
//		}
//
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (a[i] != 0) {
				a[count] = a[i];
				count++;
			}
		}
		while (count < size) {
			a[count] = 0;
			count++;
		}
		System.out.println();

		for (int a1 : a) {
			System.out.print(a1 + " ");
		}
	}

}
