package com.oops;

public class ArithmeticException {
	public static void main(String[] args) {
		int a = 10 / 0;
		try {
			System.out.println("In try we can write problematic code ");
			System.out.println(a);
		} catch (Exception am) {
			am.printStackTrace();
		} finally {
			System.out.println("In fanna;ly block ");
		}
	}

}
