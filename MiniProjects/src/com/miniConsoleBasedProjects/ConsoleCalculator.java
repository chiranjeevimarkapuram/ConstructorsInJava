package com.miniConsoleBasedProjects;

import java.util.Scanner;

public class ConsoleCalculator {

	public static void main(String[] args) {
		System.out.println("Main Method Strated ..!");
		Scanner sc = new Scanner(System.in);
		int i=0;
		int choice=0;
		do{
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulus for Remainder");
			System.out.println("6.For Exist");
			System.out.println("Enter Number for Calucate..");
			choice=sc.nextInt();
			switch(choice){
			case 1:System.out.println("Addition for two numbers");
					System.out.println("Enter a value:");
					int a = sc.nextInt();
					System.out.println("Enter b value:");
					int b=sc.nextInt();
					System.out.println("Addition Result:"+(a+b));
					break;
			case 2:System.out.println("Subtraction for two numbers:");
			System.out.println("Enter a value:");
			int x = sc.nextInt();
			System.out.println("Enter b value:");
			int y = sc.nextInt();
			System.out.println("Subtraction Result:"+(x-y));
			break;
			case 3:System.out.println("Multiplication for two numbers:");
			System.out.println("Enter first value:");
			int p = sc.nextInt();
			System.out.println("Enter second value:");
			int r = sc.nextInt();
			System.out.println("Multiplication Result:"+(p*r));
			break;
			case 4:System.out.println("Division for two numbers:");
			System.out.println("Enter first value:");
			int q = sc.nextInt();
			System.out.println("Enter second value:");
			int w = sc.nextInt();
			System.out.println("Multiplication Result:"+(q/w));
			break;
			case 5:System.out.println("Multiplication for two numbers:");
			System.out.println("Enter first value:");
			int e = sc.nextInt();
			System.out.println("Enter second value:");
			int f = sc.nextInt();
			System.out.println("Multiplication Result:"+e%f);
			break;
			case 6:
				System.out.println("Existing Thankyou..!");
			}
			
		}while(i>=5);
		sc.close();
		System.out.println("Main Ended Ended..!");
	}

}
