package com.collections;

import java.util.HashSet;

public class SubsetInSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println(set);
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println(set1);

		HashSet<Integer> set2 = new HashSet<>();

		set2.add(1);
		set2.add(2);
		set2.add(6);

		System.out.println(set1.contains(set));
//	    System.out.println(set.containsAll(set1));
	}

}
