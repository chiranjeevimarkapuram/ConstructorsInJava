package com.constructorsclassDemo;

import java.util.Scanner;

public class Custom1 {
	int cid;
	int cage;
	long phone;
	String cname;

	// Parameterized Constructor
	Custom1(int cid, int cage) {
		System.out.println("Two args parameterized constructor called");
		this.cid = cid;
		this.cage = cage;
	}

	// Method to display details
	void display() {
		System.out.println("Customer Details:");
		System.out.println("Customer ID: " + cid);
		System.out.println("Customer Age: " + cage);
	}

	// Method to take input and return a Custom object
	static Custom1 createCustomerFromInput() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Customer ID: ");
		int id = sc.nextInt();

		System.out.print("Enter Customer Age: ");
		int age = sc.nextInt();
		
		// passing values to parameterized constructor
		Custom1 c = new Custom1(id, age);
		return c;
	}

	public static void main(String[] args) {
		// Create object using user inputs
		Custom1 c1 = createCustomerFromInput();

		// Display the entered details
		c1.display();
	}
}
