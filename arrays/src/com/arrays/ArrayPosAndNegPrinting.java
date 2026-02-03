package com.arrays;

public class ArrayPosAndNegPrinting {

	public static void main(String[] args) {
		int[] a = { -1, -3, -5, 2, 4, 6,

				7, 8, 9 };
		for (int a1 : a) {
			System.out.print(a1 + " ");
		}
		System.out.println();
		System.out.println(" pairing +ve and -ve ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				System.out.print(a[i] + " , ");
//				a[i]++;
				for (int j = i; j < a.length; j++) {
					if (a[j] > 0 && a[j] != i) {
//						a[j]++;
						System.out.print(a[j] + " , ");
						break;
//						a[j]++;
					}
				}
			}
		}

//		for(int i=0;i<a.length;i++) {
//			while(a[i]<0) {
//				System.out.print(a[i]);
//				if(a[i]>0) {
//					System.out.print(a[i]);
//				}
//			}
//		}

	}

}
