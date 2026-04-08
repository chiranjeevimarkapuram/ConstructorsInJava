package infoPractice;

import java.util.Scanner;

//Palindrome ignoring spaces ("A man a plan a canal Panama")
public class PalidromeIgnoreSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.toLowerCase();
		boolean palidrome = true;
		int i = 0, j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) == ' ') {
				i++;
				continue;
			}
			if (s.charAt(j) == ' ') {
				j--;
				continue;
			}

			if (s.charAt(i) != s.charAt(j)) {
				palidrome = false;
			}
			i++;
			j--;
		}

		if (palidrome)
			System.out.println("palidrome");
		else
			System.out.println("Not palidrome");
	}

}
