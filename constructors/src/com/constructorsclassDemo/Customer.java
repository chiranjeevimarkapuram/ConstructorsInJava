package com.constructorsclassDemo;

import java.util.Scanner;

// Constructor Chaining Example
public class Customer {
	int cid;
	String cname;
	long phone;
	int age;

	// No-args constructor
	Customer() {
		System.out.println("No-args constructor called");
	}

	// One-arg constructor
	Customer(int cid) {
		System.out.println("One-arg constructor called");
		this.cid = cid;
	}

	// Three-arg constructor
	Customer(int cid, String cname, long phone) {
		System.out.println("Three-arg constructor called");
		this.cid = cid;
		this.cname = cname;
		this.phone = phone;
	}

	// Four-arg constructor
	Customer(int cid, String cname, long phone, int age) {
		System.out.println("Four-arg constructor called");
		this.cid = cid;
		this.cname = cname;
		this.phone = phone;
		this.age = age;
	}

	void show() {
		System.out.println("\n--- Customer Details ---");
		System.out.println("Customer ID: " + cid);
		System.out.println("Customer Name: " + cname);
		System.out.println("Customer Phone Number: " + phone);
		System.out.println("Customer Age: " + age);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main method started");

		// 🔹 For four-args constructor
		System.out.println("\nEnter Customer ID:");
		int id = sc.nextInt();
		sc.nextLine(); // consume leftover newline

		System.out.println("Enter Customer Name:");
		String s1 = sc.nextLine();

		System.out.println("Enter Customer Phone Number:");
		long ph = sc.nextLong();

		System.out.println("Enter Customer Age:");
		int a = sc.nextInt();

		Customer c3 = new Customer(id, s1, ph, a);
		c3.show();

		// 🔹 No-arg constructor
		Customer c1 = new Customer();
		c1.show();

		// 🔹 For three-arg constructor
		System.out.println("\nEnter ID for three-arg constructor:");
		int id2 = sc.nextInt();
		sc.nextLine(); // consume leftover newline

		System.out.println("Enter Customer Name:");
		String s2 = sc.nextLine();

		System.out.println("Enter Phone Number:");
		long ph2 = sc.nextLong();

		Customer c2 = new Customer(id2, s2, ph2);
		c2.show();

		sc.close();
	}
}
