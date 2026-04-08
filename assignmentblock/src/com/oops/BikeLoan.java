package com.oops;

import java.util.Scanner;

public class BikeLoan {

	void bikeloan() {
		Scanner sc = new Scanner(System.in);
		LoanApproveDetails ld = new LoanApproveDetails();

		ld.PersonDetails();
		ld.adharCard();
		ld.Mobile();
		ld.pancard();
		if (!ld.salary()) {
			System.out.println("Application Declined..!");
			return;
		}
		if (!ld.cibilScore()) {
			System.out.println("Appilcation Declined..!");
			return;
		}
		ld.Address();
		ld.reverify();

		System.out.println("Enter Bike Price: ");
		double bikePrice = LoanApproveDetails.sc.nextDouble();
		if (bikePrice <= ld.Salary * 2) {
			System.out.println("Bike Loan Approved!");
			System.out.println("ROI : 11.5%");
		} else {
			System.out.println("Bike Loan Rejected.");
		}

	}

}
