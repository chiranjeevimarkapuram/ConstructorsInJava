package com.arrays;

public class ClassDemo1 {

	public static void main(String[] args) {
		int[] numbers;//creating LHS of Array
		numbers= new int[5]; //Declaring the Array size 
		//Inserting the values into Array
		
		/* here,INtially whenever we create  an array size its declares the default values zero(0) before inserted. 
		 */
		
		numbers[0]=111; //LHS->0(zero declares index value in your array) RHS=111 is variable or data
		numbers[1]=222;
		numbers[2]=333;
		
//		System.out.println(numbers[0]);//calling value with the reference of index .
//		System.out.println(numbers[1]);
		
		
		//with the help of for loop we can read whole array at a time .
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		

	}

}
