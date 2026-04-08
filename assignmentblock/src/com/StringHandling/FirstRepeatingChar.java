package com.StringHandling;

public class FirstRepeatingChar {
//for(int i=0;i<str.length();i++) --> In String handling .length()
//for(int i=0;i<str.length();i++)-->In arrays .length only .No brackets .
	public static void main(String[] args) {
		String str = "Array";
//		System.out.println(System.identityHashCode(str));
//		String str1 = "Array";
//		System.out.println(System.identityHashCode(str));
//		
//		StringBuilder s =new StringBuilder("Array");
//		System.out.println(System.identityHashCode(s));
//		
//		String s3 =str+str1;
//		System.out.println(System.identityHashCode(s3));
//		
//		StringBuilder s1 =new StringBuilder("ArrayArray");
//		System.out.println(System.identityHashCode(s1));
//		
//		String s2 ="ArrayArray";
//		System.out.println(System.identityHashCode(s2));
//		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					System.out.print(str.charAt(j) + " ");
					break;
				}
			}
		}
	}
}
