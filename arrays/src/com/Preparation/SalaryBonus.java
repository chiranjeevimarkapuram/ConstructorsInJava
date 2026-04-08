package com.Preparation;

//First ₹10,000 → 10% bonus
//Next ₹20,000 → 5% bonus
//Above ₹30,000 → 2% bonus
import java.util.Scanner;

public class SalaryBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int bonussal = 0;

		if (salary > 0) {
			bonussal += Math.min(salary, 10000) * (0.10);
		}

		if (salary > 10000) {
			bonussal += Math.min(salary - 10000, 20000) * (0.05);
		}
		if (salary > 30000) {
			bonussal += (salary - 30000) * (0.02);
		}
		System.out.println(bonussal);

		sc.close();
	}

}
