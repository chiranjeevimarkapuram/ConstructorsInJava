package com.oops;

import java.util.Scanner;

public class LoanPage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To Our Loan App..! ");
		System.out.println("Choose Your Loan Type..! ");
		System.out.println("1.HomeLoan");
		System.out.println("2.Car Loan");
		System.out.println("3.Bike Loan");
		LoanPage lp = new LoanPage();

		int loan;
		System.out.println("Choose Your Loan Type..! ");
		loan = sc.nextInt();
		if (loan == 1) {
			System.out.println("You Selected Home Loan Please Enter the Below Details ..!");
			// I want to ask Home details here if Loan ==1 ,so Created homeloan class object
			// and
			// with the reference call that homeloan details
			HomeLoan Hl = new HomeLoan();
			Hl.Homeloan();
		} else if (loan == 2) {
			System.out.println("You Selected Car Loan Please Enter the Below Details ..!");
			// I want to ask car details here if Loan ==1
			CarLoan cl = new CarLoan();
			cl.Carloan();
		} else if (loan == 3) {
			System.out.println("You Selected Bike Loan Please Enter the Below Details ..!");
			// I want to ask Bike details here if Loan ==1
			BikeLoan bl = new BikeLoan();
			bl.bikeloan();

		} else {
			System.out.println("Invalid loan Type..!");
		}
	}
}
