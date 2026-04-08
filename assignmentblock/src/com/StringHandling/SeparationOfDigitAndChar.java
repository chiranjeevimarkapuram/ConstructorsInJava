package com.StringHandling;

// i/p: V100Cubej81ava
//o/p: vcubejava
//100 81

public class SeparationOfDigitAndChar {

	public static void main(String[] args) {
		String s = "V100Cubej81ava";
		String l ="";
		int d=0 ;
		for (int i = 0; i < s.length(); i++) {
			char c =s.charAt(i);
			if(Character.isLetter(c)){
				l+=Character.isLetter(c);
			}else if(Character.isDigit(c)) {
//				d =Character.isDigit(c);
			}
		}
		System.out.println(l);
		
	}

}
