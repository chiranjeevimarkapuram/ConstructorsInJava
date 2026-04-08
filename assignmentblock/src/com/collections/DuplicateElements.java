package com.collections;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElements {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(1);
		a.add(9);
		a.add(1);
		a.add(6);
		a.add(2);
		System.out.println(a);
//		Collections.addAll(a, 99, 88, 77, 66, 55, 44, 33);
//		System.out.println(a);
//		a.add(7, 111);
//		System.out.println(a);
//		a.add(00001);
//		System.out.println(a);

		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(i).equals(a.get(j))) {
					System.out.println("Duplicate Element :" + a.get(j));
					break;
				}
			}
		}
	}
}
