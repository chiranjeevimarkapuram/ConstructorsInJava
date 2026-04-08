package com.StringHandling;

//i/p:abbbcceee
//o/p:a1b3c2e3
public class StringAppending {

	public static void main(String[] args) {
		String s = "abbbcceeeffffffff";
		String r = "";
		for (int i = 0; i < s.length(); i++) {
//			System.out.println(s.charAt(i)+" ");
			char c = s.charAt(i);
//			System.out.println(c);
			int count = 1;
			while ((i + 1) < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				count++;
				i++;
			}
			r = c + "" + count;
			System.out.print(r);
		}

	}

}
