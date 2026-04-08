package com.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

//Multiple Exception Handling with multiple catch blocks 
public class EhDemo2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter a number:  ");
		int a = sc.nextInt();
		System.out.println("Entered number is :" + a);

		System.out.println("Enter b value:");
		int b = sc.nextInt();
		System.out.println("B value is: " + b);
		
		String s1 = null;
		String s2 = "Chiranjeevi";
		
		int[] arr = { 1, 2, 3, 4 };

		try {
			System.out.println("a/b is  :  " + a / b);
			System.out.println(arr[9]);
			s1.length();
			s2.charAt(12);			
		} catch (InputMismatchException im) {
			System.err.println(" Invalid input ..!");
			im.printStackTrace();
		} catch (IndexOutOfBoundsException ib) {
			System.err.println("IndexOutBoundsException");
			ib.printStackTrace();
		} catch (NullPointerException np) {
			System.out.println("NullPointer Exception");
		} catch (ArithmeticException am) {
			System.err.println(am.getLocalizedMessage());
		} catch (NumberFormatException nf) {
			nf.printStackTrace();
			System.err.println(nf.getMessage());
		}
	}

}
