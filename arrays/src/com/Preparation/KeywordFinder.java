package com.Preparation;

import java.util.Scanner;

public class KeywordFinder {
	public static void main(String[] args) {
		String[] keywords = { "break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if",
				"map", "range", "return", "struct", "switch", "type", "var" };
		Scanner sc = new Scanner(System.in);
		if (!sc.hasNext())
			return;
		String input = sc.next();

		// --- WRITE YOUR LOGIC HERE ---
		// Goal: Check if 'input' exists in 'keywords' array.
		// Print: "[input] is a keyword" OR "[input] is not a keyword"

		boolean found = false;
		for (int i = 0; i < keywords.length; i++) {
			if (input.equals(keywords[i])) {
				found = true;
				break;
			}
		}

		if (found)
			System.out.println(input + " is a keyword");
		else
			System.out.println(input + " is not a keyword");
	}

}
