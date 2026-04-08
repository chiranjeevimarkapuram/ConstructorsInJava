package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class FirstDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method s..");
 
//	 <> warning  
		Collection c = new ArrayList();
		c.add("chiru");
		c.add(100);
		c.add('c');
		c.add(10.5);
		c.add(true);

		System.out.println(c);

		Collection c1 = new ArrayList();
		c1.addAll(c);
		System.out.println(c1);
		
		Collection<Integer> c2 = new ArrayList<>(10);
		System.out.println(">>>>>>>>>>>>>>>");
		
//		c2.add("CHIRU");
//		c2.add("100");
		
		c2.addAll(c1);
		System.out.println(c2);
		
		
		Collection<Integer> c3 = new ArrayList<>();
		c3.add(99);
		c3.add(199);
//		c3.addAll(c2);
		System.out.println(c3);
		

	}
}
