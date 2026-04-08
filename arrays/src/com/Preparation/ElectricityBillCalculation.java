package com.Preparation;

import java.util.Scanner;

public class ElectricityBillCalculation {
//	First 100 units → ₹5/unit
//	Next 100 units → ₹7/unit
//	Above 200 units → ₹10/unit
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int bill = sc.nextInt();
		int gbill = 0;

		if (bill > 0) {
			gbill += Math.min(bill, 100) * 5;
		}

		if (bill > 100) {
			gbill += Math.min(bill - 100, 100) * 7;
		}
		if (bill > 200) {
			gbill += (bill - 200) * 10;

		}
		System.out.println(gbill);
	}
}
