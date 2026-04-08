package com.Preparation;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		int[] array = new int[9];
		array[0] = 1;
		array[1] = 3;
		array[2] = 4;
		array[3] = 6;
		array[4] = 1;
		array[5] = 5;
		array[6] = 14;
		array[7] = 6;
		array[8] = 3;
		for (int n : array) {
			System.out.print(n + " ");
		}

		System.out.println();
		int c = 0;
		for (int i = 0; i < array.length; i++) {
			for (int k = i+1; k < array.length; k++) {
				if (array[i] == array[k]) {
					System.out.print(array[k] + " ");	
				}
			}
		}
		
		System.out.println();
//		print without duplicates 
		for (int i = 0; i < array.length; i++) {
			for (int k = i+1; k < array.length; k++) {
				if (array[i] != array[k]) {
					System.out.print(array[i] + " ");
					break;
				}
			}
		}
		
	}

}
