package com.constructorsclassDemo;

import java.util.Scanner;

public class Custom {
	int cid;
	int cage;
	long phone;
	String cname;

//	Custom() {
//
//	}

//for two agrs input statement
	static Custom inputdetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Customer Details");

		System.out.println("Enter Cid:");
		int id = sc.nextInt();

		System.out.println("Enter age :");
		int age = sc.nextInt();

		Custom c3 = new Custom(id, age);

		return c3;
		// sc.close();

	}

	// for three agrs input statement
	static Custom inputdetails1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Customer Details");

		System.out.println("Enter Cid:");
		int id = sc.nextInt();

		System.out.println("Enter age :");
		int age = sc.nextInt();

		System.out.println("Enter Name:");
		String cname = sc.next();

		Custom c4 = new Custom(id, age, cname);

		return c4;
		// sc.close();

	}

	// two args method for printing
	void display() {
		System.out.println("Your Customer Id is :" + cid);
		System.out.println("Your Age is:" + cage);
	}

	// three args method for printing
	void display1() {
		System.out.println("Your Customer Id is :" + cid);
		System.out.println("Your Age is:" + cage);
		System.out.println("Your Name is:" + cname);
	}

	// Two args parameter constructor
	Custom(int cid, int cage) {
		System.out.println("Two agrs parameter constructor");
		this.cid = cid;
		this.cage = cage;

	}

// Three args parameter constructor
	Custom(int cid, int cage, String cname) {
		System.out.println("Three agrs parameter constructor");

		this.cid = cid;
		this.cage = cage;
		this.cname = cname;

	}

	public static void main(String[] args) {

		Custom c3 = inputdetails();// store returned object
		c3.display();

		Custom c4 = inputdetails1(); // store returned object
		c4.display1();

	}

}
