package com.ExceptionHandling;

import java.util.Scanner;

//1.Write a java program to handle the exceptions with multiple try-catch finally blocks 
//1.ArithmeticException 
//2.NullPointerException
//3.ArrayOutOfBounsException
//4.InputMissMatchException
public class MultipleTryCatchs {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a Value:");
			int a = sc.nextInt();
			System.out.println("Enter b value ");
			int b = sc.nextInt();
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.err.println("In Catch 1 Am");
			ae.printStackTrace();
			try {
				String s1 = null;
				System.out.println(s1.length());
			} catch (NullPointerException ne) {
				System.err.println("In catch 2 NP");
				System.out.println(ne.getLocalizedMessage());
				System.out.println(ne.getMessage());
				try {
					int[] a = new int[4];
					a[5] = 0;

				} catch (Exception aoe) {
					System.err.println("ArrayOutOfBounsException");
				}
			} finally {
				System.out.println("Finally block for NP");
			}
		} finally {
			System.out.println("Finally block 1");
		}

		System.out.println("Main Method Ended ..!");
	}

}
