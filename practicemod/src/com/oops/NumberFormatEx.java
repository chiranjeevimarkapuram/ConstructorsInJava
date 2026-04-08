package com.oops;

public class NumberFormatEx {

	public static void main(String[] args) {
		System.out.println("NumberFormatExceptoin ");

		String s1 = "adcd2";
		try {
			System.out.println("In try ...!");
			int a = Integer.parseInt(s1);
		} catch (Exception e) {
			System.err.println("In catch");
			e.printStackTrace();
		} finally {
			System.out.println("In finally..!");
		}

	}

}
