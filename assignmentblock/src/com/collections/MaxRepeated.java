package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxRepeated {

	public static void main(String[] args) {
//		List<Integer> l = new ArrayList<>();
//		Collections.addAll(l, 1, 2, 3, 2, 9, 1, 2, 1, 1, 2, 1);
//		System.out.println(l);

		Scanner sc = new Scanner(System.in);

        List<Integer> l = new ArrayList<>();

        String input = sc.nextLine(); 
        // Read entire line: "10 20 30 40 50"

        String[] numbers = input.split(" "); 
        // Split by space → ["10","20","30","40","50"]

        for (String num : numbers) {
            l.add(Integer.parseInt(num)); 
            // Convert string → int and add to list
        }

        System.out.println(l);
//		Scanner sc = new Scanner(System.in);
//		
//		String input=sc.nextLine();
//		
//		String[] numbers = input.split(" ");
//		
//		for(String s1:numbers) {
//			l.add(Integer.parseInt(s1));
//		}
//		System.out.println(l);
		
//		int n = sc.nextInt(); // number of elements
//		for (int i = 0; i < n; i++) {
//			l.add(sc.nextInt()); // add each element
//		}
//
//		for (int a : l) {
//			System.out.print(a + " ");
//		}
		int a = l.size();
		for (int i = 0; i < a; i++) {
			int count = 0;
			for (int j = 0; j < a; j++) {
				if (l.get(i).equals(l.get(j))) {
					count++;
				}
			}
			if (count >= a / 2) {
				System.out.println("Repeted number is  : " + l.get(i) + "  &&  " + "count is :" + count);
				break;
			}
		}

	}
}
