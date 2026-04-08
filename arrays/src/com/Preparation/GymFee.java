package com.Preparation;

import java.util.Scanner;

//A gym offers subscription plans based on duration.
//
//The available plans are:
//
//Duration (months) Cost (₹)
//1 2000
//3 5000
//6 9000
//9 12000
//12 15000
//
//Your task is to determine the total fee based on the number of months selected.
//
//If the input does not match any of the available plans, print "Error".
//
//📥 Input Format
//A single integer M representing number of months
//📤 Output Format
//Print the corresponding fee
//If invalid → print "Error"
//🧪 Example
//Input
//3
//Output
//5000
public class GymFee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
//		switch (n) {
//		case 1:
//			System.out.println(2000);
//			break;
//		case 3:
//			System.out.println(5000);
//			break;
//		case 6:
//			System.out.println(9000);
//			break;
//		case 9:
//			System.out.println(12000);
//			break;
//		case 12:
//			System.out.println(15000);
//			break;
//		default:
//			System.out.println("Error");
//	}
		if (n == 1) {
			System.out.println(2000);
		} else if (n == 3) {
			System.out.println(5000);
		} else {
			System.out.println("Error");
		}
	}

}
