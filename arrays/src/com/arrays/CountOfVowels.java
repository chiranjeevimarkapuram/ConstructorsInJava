package com.arrays;

public class CountOfVowels {

	public static void main(String[] args) {
		String s1 = "hello world";
		String[] s11 = { "a", "i", "o", "e", "u" };
		int count = 0;
		s1=s1.toLowerCase();
		for (int i = 0; i < s1.length(); i++) {
			String ch = String.valueOf(s1.charAt(i));
			for (String v : s11) {
				if (ch.equals(v)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
