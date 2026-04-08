package loops;
/*2) Java Program to Print All Perfect Numbers
 *   Between 1 and 1000
Output: 
Perfect numbers between 1 and 1000 are:
6
28
496*/

import java.util.Scanner;

public class AllPerfect {

	public static void main(String[] args) {
	/*	System.out.println("Main Method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
		int sum = 0;
		int i;
		for (i = 1; i <= a; i++) {
			
			if (a % i == 0) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		// System.out.println(a+" Perfect Number");
		if (sum == a) {
			System.out.println(a+"  perfect");
		
		} 
		
		else {
			System.out.println(a + "   Not perfect");
		}

	}*/
		 System.out.println("Main Method started");
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int sum = 0;

	        // Find divisors and calculate their sum
	        for (int i = 1; i < num; i++) {
	            if (num % i == 0) {
	            	System.out.println(i);
	                sum = sum + i;
	            }
	        }

	        // Check if sum of divisors equals the number
	        if (sum == num) {
	        	
	            System.out.println(num + " is a Perfect Number.");
	        } else {
	            System.out.println(num + " is not a Perfect Number.");
	        }

	        sc.close();
	        System.out.println("Main Method ended");
	    }

}
