package infoPractice;

import java.util.Scanner;

/*Problem Statement:
Check whether a given string is a Palindrome (ignore case).

Input:
str = "Madam"

Output:
Palindrome
*/
public class Palidrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = 0, j = s.length() - 1;
		boolean IsPalidrome = true;
		s = s.toLowerCase();
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				IsPalidrome = false;
				break;
			}
			i++;
			j--;
		}
		if (IsPalidrome) {
			System.out.println("Plaidrome");
		} else {
			System.out.println("Not");
		}

	}

}
