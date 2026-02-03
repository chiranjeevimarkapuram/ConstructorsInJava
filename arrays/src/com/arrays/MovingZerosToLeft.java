package com.arrays;

//import java.util.Scanner;

public class MovingZerosToLeft {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int[] arr = { 2, 0, 4, 1, 0, 0, 5 };
		int temp = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] <= 0 && arr[i] < arr[j]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//
//				}
//			}
//			 System.out.print(arr[i] + " ");
//		}
// Same Requirement by using for loop 

//		int[] arr = { 2, 0, 4, 1, 0, 0, 5 };
//		for (int n : arr) {
//			if (n > 0) {
//				System.out.print(n + " ");
//			}
//
//		}
//		for (int n1 : arr) {
//			if (n1 <= 0) {
//				System.out.print(n1 + " ");
//			}
//
//		}

//      same requirement by for loop
//		int[] arr = { 2, 0, 4, 1, 0, 0, 5 };
		int end = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = temp;
				arr[end] = temp;

			}
		}
		for (int n : arr) {
			System.out.print(n + "  ");
		}

	}

}
