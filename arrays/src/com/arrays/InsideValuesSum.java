package com.arrays;

//i/p: int a[] = {12,23,45,93,11,21,91};
//o/p:  {12,23,45,93,11,21,91,3,5,9,2,3,10}

public class InsideValuesSum {

	public static void main(String[] args) {
		System.out.println("Main Method ..!");

		int a[] = { 12, 23, 45, 93, 11, 21, 91 };

		for (int n2 : a) {
			System.out.print(n2 + " , ");
		}
		
		int sum = 0;
		int r = 0;
		int n1 = 0;
		for (int j = 0; j < a.length; j++) {
			for (int i = j; i < a.length; i++) {
				r = a[j] / 10; //r = 2
				n1 = a[j] % 10;// n1 =1  
				sum = r + n1;
			}
			System.out.print(sum + " ,");

		}

	}

}
