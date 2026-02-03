package com.arrays;

import java.util.Scanner;

/*int[] a = {1,2,3,4}==>{product of array}==>{div with array elemnet one by one}
output= {24,12,8,4}
int[] a = {1,0,3,4} ==>o/p: {12,o,4,3}
*/
public class Testarr5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int size = sc.nextInt();
		System.out.println("Enter Array values based on size" + size);
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		int prod = 1;
		for (int n : a) {
			if (n < 0) {
				break;
			}
			if (n > 0) {
				prod *= n;
			}
		}

		System.out.println("product of an array:" + prod);
		System.out.println("After Division Array:");

//		for (int n1 : a) {
//			if (n1 != 0) {
//				System.out.print(0);
//			} else {
//				System.out.print(prod / n1 + " ");
//			}
//		}

		int[] c = new int[size];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				c[i] = prod / a[i];
			} else {
				c[i] = a[i];
			}
		}
		for (int n3 : c) {
			System.out.print(n3 + " ");
		}
	}
}
