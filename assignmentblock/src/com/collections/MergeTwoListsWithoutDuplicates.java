package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeTwoListsWithoutDuplicates {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();

		List<Integer> list2 = new ArrayList<>();

		Collections.addAll(list1, 1, 2, 3);
		Collections.addAll(list2, 3, 4, 5);

		List<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);

		System.out.println("Before :   " + list3);
		Set<Integer> s1 = new HashSet<>();
		s1.addAll(list3);
		System.out.println("After : " + s1);

	}

}
