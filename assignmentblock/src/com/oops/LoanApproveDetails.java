package com.oops;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoanApproveDetails {
	static Scanner sc = new Scanner(System.in);
	String Name;
	String NameL;
	String status;
	String mobile;
	String pancard;
	String adharCard;
	double Salary;
	int cibil;
	int Flat_No;
	String Street;
	String plotno;
	String city;
	String State;
	long pincode;

	void PersonDetails() {
		System.out.println("Enter Your First Name : ");
		Name = sc.next();
		System.out.println("Enter Your Last Name : ");
		NameL = sc.next();
	}

	void Mobile() {
		Pattern p = Pattern.compile("[6-9]{1}[0-9]{9}");

		while (true) {
			System.out.println("Enter Your Mobile Number :");
			mobile = sc.next();
			Matcher m = p.matcher(mobile);
			if (m.matches()) {
//				System.out.println("Valid Mobile Number");
				break;
			} else {
				System.out.println("Invalid Mobile Number");
			}
		}

	}

	String adharCard() {

		Pattern p = Pattern.compile("[4-9]{1}[0-9]{11}");
		while (true) {
			System.out.println("Enter Adhar Card Number : ");
			adharCard = sc.next();
			Matcher m = p.matcher(adharCard);
			if (m.matches()) {
//				System.out.println("vaild Adhar Card Number..!");
				break;
			} else {
				System.out.println("InValid Adhar Card Number..!");
			}
		}
		return adharCard;

	}

	String pancard() {
		Pattern p = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		while (true) {
			System.out.println("Enter Pan Card Number : ");
			pancard = sc.next();
			Matcher m = p.matcher(pancard);
			if (m.matches()) {
//				System.out.println("Vaild Pan Card Number ..!");
				break;
			} else {
				System.out.println("InVaild Pan Card Number..!");
			}
		}
		return pancard;
	}

	void Address() {

		System.out.println("Enter Your Address... Below");
		System.out.println("Enter PlotNo: ");
		plotno = sc.next();
		System.out.println("Enter Flat_No: ");
		Flat_No = sc.nextInt();
		System.out.println("Enter Street : ");
		Street = sc.next();
		System.out.println("Enter City : ");
		city = sc.next();
		System.out.println("PINCODE: ");
		pincode = sc.nextLong();
	}

	String Status() {
		System.out.println("Enter If Your Single/Married :  ");
		status = sc.next();
		return status;
	}

	boolean salary() {

		System.out.println("Enter Your Annual Salary : ");
		Salary = sc.nextDouble();

		if (Salary > 100000) {
			return true;
		} else {
			System.out.println("Salary Not Matched for these Loan");
			return false;
		}
	}

	boolean cibilScore() {
		System.out.println("May I know Your Cibil Score : ");
		cibil = sc.nextInt();

		if (cibil > 750) {
			return true;
		} else {
			System.out.println("Cibil Score Not Matched.");
			return false;

		}
	}

//	void ApprovedOrRejected() {
//		if (Salary > 100000 && cibil > 700) {
//			System.out.println("congrats Loan Approved..!");
//			System.out.println("ROI : " + 10.5);
//		} else {
//			System.out.println("Sorry.Loan Rejected..");
//		}
//	}

	void reverify() {
		System.out.println("-------Please Reverify Your Details..!----------");
		System.out.println("Your Name : " + Name + " " + NameL);
		System.out.println("Your Adhar Card :" + adharCard);
		System.out.println("Your Mobile Number is : " + mobile);
		System.out.println("Your Pan Card Number is : " + pancard);
		System.out.println("Your Marriage Status : " + status);
		System.out.println("Address Info : " + plotno + " ," + Flat_No + " ," + Street + " ," + city + " ," + pincode);
	}

}
