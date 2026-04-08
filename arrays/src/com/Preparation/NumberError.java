package com.Preparation;

import java.util.Scanner;

public class NumberError {

	static String Error() {
		return "Error";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();

		String error = Error();
		if (n.trim().isEmpty()) {
			System.out.println(error);
		} else {
			System.out.println(n);
		}
		
		
		
	}

}
