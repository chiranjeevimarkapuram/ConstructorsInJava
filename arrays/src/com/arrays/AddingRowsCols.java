package com.arrays;

public class AddingRowsCols {

	public static void main(String[] args) {
		int a1[] = { 10, 20, 30 };
		int b1[] = { 30, 20, 10 };
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < a1.length; i++) {
			sum1 = sum1 + a1[i];
		}
		System.out.println("Sum of Array a1 is:" + sum1);// 60

		int avg1 = sum1 / a1.length;
		System.out.println("Avg of Array a1 is:" + avg1);
//Array2
		for (int i = 0; i < b1.length; i++) {
			sum2 = sum2 + b1[i];
		}
		System.out.println("Sum of Array b1  is:" + sum2);
		System.out.println("Avg of Array b1 is:" + (sum2 / b1.length));

//		System.out.println("Adding Two arrays");
//
//		// System.out.println(a1[0]+b1[0]);
//
//		int csum = 0;
//		for (int i = 0; i < a1.length; i++) {
//			for (int j = b1.length-1; j >=0; j--) {
//				if (a1[i] == b1[j]) {
//					csum=csum+a1[i] + b1[j];
//					//System.out.println(csum);
//				}
////				csum=csum+a1[i]+b1[j];
////				if(j<=3) break;
//			}
//		}
//		System.out.println("Adding cols 2 Arrays:" + csum);

		
		// System.out.println(a1[0]+b1[0]);
		
		System.out.println("Cols - wise addition");
		int c[]=new int[3];
		for(int i=0;i<a1.length;i++) {
			c[i]=a1[i]+b1[i];
		}
		for(int val:c) {
		System.out.println(val);
		
		}
		
		
		
		
		
		
		
	}

	
	
	
}
