package com.Preparation;

import java.util.Scanner;

//Parking Fee Calculation
//📌 Problem Statement
//
//A parking area charges fees based on the number of hours a vehicle is parked:
//
//For the first 2 hours, the charge is ₹100 per hour
//For the next 3 hours (i.e., from hour 3 to 5), the charge is ₹50 per hour
//For any time beyond 5 hours, the charge is ₹20 per hour
//📥 Input Format
//A single integer hours representing the total number of hours the vehicle is parked
//📤 Output Format
//Print a single integer representing the total parking fee
//⚠️ Constraints
//0 ≤ hours ≤ 10^5
//
//🧪 Example
//Input
//6
//Output
//370

public class ParkingFeeCal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int fee = 0;

		if (n > 0) {
			fee = fee + Math.min(n, 2) * 100;
		} if (n > 2) {
			fee = fee + Math.min(n - 2, 3) * 50;
		}  if (n > 5) {
			fee += (n - 5) * 20;
		}
		System.out.println(fee);
	}

}
