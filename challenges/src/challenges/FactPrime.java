package challenges;

import java.util.Scanner;

public class FactPrime {

//	static int Fact(int n) {
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				System.out.println(i);
//				for (int j = 2; j <= i / 2; j++) {
//                    if (i % j == 0) {
//                    	System.out.println(j);
//                    }
//
//			}
//		}
//		return n;
//	}

//	static boolean isPrime(int i) {
//		if(i%2==0) {
//			System.out.println(i);
//		}
//		return true;	
//	}
//	public static void main(String[] args) {
//		System.out.println("Main Method Strated..!");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number :");
//		int n = sc.nextInt();
//		//Fact(n);
//		// isPrime(n);
//		// System.out.println(n);
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				System.out.println(i);
//				for (int j = 2; j <= i / 2; j++) {
//                    if (i % j == 0) {
//                    	System.out.println(j);
//                    }
//
//			}
//		}
//		}
//		System.out.println("Main Method Ended..!");
//	}
//
//}

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a Number :");
	        int num = sc.nextInt();

	        // Step 1: Print all factors
	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                System.out.println(i);
	            }
	        }
	        System.out.print("Prime numbers are: ");
	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {        
	                boolean isPrime = true;
	                if (i <= 1) {
	                    isPrime = false;
	                } else {
	                    for (int j = 2; j <= i / 2; j++) {
	                        if (i % j == 0) {
	                            isPrime = false;
	                            break;
	                        }
	                    }
	                }
	                if (isPrime) {
	                    System.out.print(i + " ");
	                }
	            }
	        }
	    }
	}
