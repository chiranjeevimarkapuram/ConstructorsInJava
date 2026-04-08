package com.ExceptionHandling;

import java.util.Scanner;

public class EhDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started..!");
		while (true) {
			try {
				System.out.println("in try ");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Number: ");
				int a = sc.nextInt();
				System.out.println("Entered value:"+a);
				break;
			} catch (Exception e) {
				System.out.println("in catch");
				e.printStackTrace();
				System.err.println("-->Please Enter Vaild Input ..!");
			}
		}
		
		System.out.println("Main Method Ended..!");
	}

}
