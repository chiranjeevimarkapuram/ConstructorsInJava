package assignmentblock;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter s1 : ");
		String s1 = sc.nextLine();
		System.out.println("Enter s2 :");
		String s2 = sc.nextLine();
		if (s1.length() != s2.length()) {
			System.out.println("Not an Anagram");
			return;
		}

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();

		Arrays.sort(a1);
		Arrays.sort(a2);

		if (Arrays.equals(a1, a2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("not an Anagram");
		}

	}

}
