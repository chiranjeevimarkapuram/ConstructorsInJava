package com.collections;

import java.util.ArrayList;
import java.util.List;

public class MaxSal {

	public static void main(String[] args) {
		List<Double> c = new ArrayList<>();
		c.add(10000.0);
		c.add(30000.0);
		c.add(40000.0);
		c.add(50000.0);
		c.add(20000.0);
		System.out.println(c);
//		Object[] d = c.toArray();
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i));
		}

//		Double d=0.0;
//		for (Double sal : c) {
//			if (sal > d) {
//				d = sal;
//			}
//		}
//		System.out.println("Max sal : " + d);

	}

}
