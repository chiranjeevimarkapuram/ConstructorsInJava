package assignmentblock;

import java.util.Scanner;
/*Java:
1) Write a Java program to print all numbers between 1 and 100
 that are both even and factors of 60.
*/

public class EvenFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		for (int i = 1; i <= n / 2; i++) {
			if (i % 2 == 0 && n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);
	}
}
