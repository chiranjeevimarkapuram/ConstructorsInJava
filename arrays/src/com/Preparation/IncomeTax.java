package com.Preparation;

import java.util.Scanner;

//Up to ₹2,50,000 → No tax
//₹2,50,001 – ₹5,00,000 → 5%
//₹5,00,001 – ₹10,00,000 → 20%
//Above ₹10,00,000 → 30%
public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sal = sc.nextInt();
		int tax = 0;

		if (sal > 250000) {
			tax += Math.min(sal - 250000, 250000) * (0.05);
		}

		if (sal > 500000) {
			tax += Math.min(sal - 500000, 250000) * (0.20);
		}
		if (sal > 1000000) {
			tax += (sal - 1000000) * (0.30);
		}
		System.out.println(tax);

	}

}
