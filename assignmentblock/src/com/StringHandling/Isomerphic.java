package com.StringHandling;

import java.util.Scanner;

// paper 
// title
public class Isomerphic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String s = sc.nextLine();
		System.out.println("Enter 2 String : ");
		String s2 = sc.nextLine();
		int a[] = new int[256];
		int b[] = new int[256];
		

		boolean bb = true;
		if (s.length() != s2.length()) {
			System.out.println("Not isomerphic");
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			char c1 = s2.charAt(i);
			if (s.indexOf(c) != s2.indexOf(c1) && s.lastIndexOf(c) != s2.lastIndexOf(c1)) {
				bb = false;
				break;
			}
		}

		if (bb==true) {
			System.out.println("Isomerphic ");
		}else {
			System.out.println("Not Isomerphic");
		}
	}
}
