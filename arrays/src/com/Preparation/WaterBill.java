package com.Preparation;

//Problem: Water Bill + Fixed Charge
//First 50 units → ₹3/unit
//Next 100 units → ₹5/unit
//Above 150 units → ₹8/unit
//If total bill > ₹1000 → add 10% surcharge
//Add fixed meter charge ₹100
import java.util.Scanner;

public class WaterBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int units = sc.nextInt();
		int bill = 0;

		if (units > 0) {
			bill += Math.min(units - 50, 50) * 3;
		}
		if (units > 50) {
			bill += Math.min(units - 50, 100) * 5;
		}
		if (units > 150) {
			bill += units - 150 * 8;
		}
		bill += 100;// fixed meter charge

		if (bill > 1000) {
			bill = bill * ((int) 0.10);
		}
	}

}
