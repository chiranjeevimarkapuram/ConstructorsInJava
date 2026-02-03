package com.arrays;

public class StringDuplicates {

	public static void main(String[] args) {
		String[] str = { "Tommy", "jhon", "Tommy", "harry"};
		int[] n= new int[str.length];
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j] && str[i].equalsIgnoreCase(str[j])) {
					System.out.print("Duliplicate :"+str[j] + " ");
				}
			}
		}
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if (str[i] != str[j] && str[i].equalsIgnoreCase(str[j])) {
					System.out.print("Not Duliplicates :"+str[j] + " ");
					i++;
					j++;
				}
			}
		}
	}
}
