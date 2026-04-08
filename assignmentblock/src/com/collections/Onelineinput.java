package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Onelineinput {
	public static void main(String[] args) {
		 
		        Scanner sc = new Scanner(System.in);
		        List<Integer> list = new ArrayList<>();

		        
		        String input = sc.nextLine().trim(); 
		        String[] numbers = input.split("\\s+"); // handles multiple spaces

		        for (String num : numbers) {
		            try {
		                list.add(Integer.parseInt(num));
		            } catch (NumberFormatException e) {
		                System.out.println("Skipping invalid input: " + num);
		            }
		        }

		        System.out.println(list);
		        sc.close();
		    }
		}
