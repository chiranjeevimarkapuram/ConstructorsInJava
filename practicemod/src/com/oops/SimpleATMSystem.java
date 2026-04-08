package com.oops;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.ArithmeticException;

public class SimpleATMSystem {
	// Project Description
//This application simulates a simple ATM system where the user can:
//
//Check balance
//
//Deposit money
//
//Withdraw money
//
//The project handles:
//
//Invalid input (InputMismatchException)
//
//Insufficient balance (ArithmeticException)
//
//Invalid choices
//
//Negative amounts
	static int balance = 5000;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean exit = false;
		System.out.println("---Welcome to ATM---");
		while (!exit) {
			try {
				System.out.println("1.check Balance ");
				System.out.println("2.Add Amount ");
				System.out.println("3.Withdraw Amount ");
				System.out.println("4.Exit ");
				System.out.println("Choose Option :");

				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Avaliable Balance : " + balance);
					break;
				case 2:
					System.out.println("Add Amount to your Account : ");
					int add = sc.nextInt();
					if (add <= 0) {
						throw new java.lang.ArithmeticException("Invalid Deposit Amount");
					}
					balance += add;
					System.out.println("Amount added Successfully..!");
					break;
				case 3:
					System.out.println("Enter Withdraw Amount :");
					int wd = sc.nextInt();
					if (wd <= 0 || wd > balance) {
						throw new ArithmeticException("Invalid Amount to Withdraw or No Sufficent Balance");
					}
					balance -= wd;
					System.out.println("Withdraw Successfully ..!");
					break;
				case 4:
					exit = true;
					System.out.println("ThankYou ...!");
					break;
				default:
					System.out.println("Invalid Choice ");
				}
			} catch (InputMismatchException im) {
				System.err.println("please Enter valid number ");
				im.printStackTrace();
				break;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("Transaction Closed ");
			}
		}
	}

}
