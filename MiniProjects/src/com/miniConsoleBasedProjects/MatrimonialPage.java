package com.miniConsoleBasedProjects;
/*Write a Program to develop a console Based Matrimonial site */

import java.util.Scanner;

public class MatrimonialPage {

	public static void main(String[] args) {
		System.out.println("Welcome to Telugu Matrimonial Site");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age:");
		int age = sc.nextInt();

		if (age >= 22 || age <= 28) {
			System.out.println("Enter Your Full Name please:");
			String d = sc.nextLine();
			System.out.println(d);
		} else {
			System.out.println("Sorry , for the Inconivence Your profile is not matched with us..!");
		}

	}

}
