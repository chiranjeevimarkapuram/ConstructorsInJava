package com.javaintrodution;

public class Blocks {
	 
	static int a=10;
	
	//static block
	static{
		System.out.println(":)");
	}
	
	//instance block
	
	{
		System.out.println("Instance Block");
		int a=10;
		int b=10;
		System.out.println(a+b);	
	}

	public static void main(String[] args) {
		System.out.println("Main method Started");
		System.out.println(a);
		Blocks a=new Blocks();
		
	
	}

}
