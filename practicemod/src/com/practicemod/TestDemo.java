package com.practicemod;
//printing 2 decimal points in float value

import java.text.DecimalFormat;

public class TestDemo {

	float a = 123.987654F;
	float b = .123F;

	float f1 = .23455f;
	float f2 = 123.2345345F;

	public static void main(String[] args) {
		TestDemo z = new TestDemo();
//		we can use decimal format to print 2 decimal values by import the package text.decimalformat package
//		"#.00" → if you don’t care about leading zeros.
//		"0.00" → if you always want something like 0.50 instead of .50.
//		"#,###.00" → for currency or formatted numbers.

		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("DecimalFormat for F1:" + df.format(z.f1));

		System.out.println("welcome");
		System.out.printf("float value:(a):%.2f%n", z.a);
		System.out.printf("float value:%.2f%n", z.b);

	}

}

/*
 * package com.practicemod;
 * 
 * public class TestDemo {
 * 
 * float a = 123.987654F; float b = 1.123F;
 * 
 * public static void main(String[] args) { TestDemo z = new TestDemo();
 * System.out.println("welcome");
 * 
 * // Correct way to format with printf
 * System.out.printf("Float value (a): %.2f%n", z.a);
 * System.out.printf("Float value (b): %.2f%n", z.b); } }
 */
