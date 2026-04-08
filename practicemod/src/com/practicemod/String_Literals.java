package com.practicemod;

public class String_Literals {

	String s1 = "Chiru";// string literal String Constant Pool (SCP)

	String s2 = "Tejesh";

//	 public static void main(String[] args) {
	void main() {
		System.out.println("Instance Main Method Started");
		System.out.println(s1);
		System.out.println(s2);
		String s3 = new String("Vijay");
		System.out.println(s3);
		String s4 = new String("Vijay");

		if (s1 == s2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if (s3.equals(s4)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		String s5 = new String("Chiru");
		String s6 = s5.intern();

		if (s1 == s6) {
			System.out.println("s1==s6: true");

		} else {
			System.out.println("s1==s6: false");
		}

//	String s5 = s3.intern();
//	
//	String s6="vijay";

//	if(s5==s6) {
//		System.out.println("s5==s6:true");
//	}
//	else {
//		System.out.println("s5==s6: false");
//	}

	}
}
