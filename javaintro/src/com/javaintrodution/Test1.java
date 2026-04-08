package com.javaintrodution;

public class Test1 {	
	void instance1() {
		System.out.println("Instance1 Method");	
		instance2();
	}
	void instance2() {
		System.out.println("Instance2 Method");	
	}
	static void st() {
		System.out.println("Static Method1");
		st1();	
	}
	static void st1() {
		System.out.println("Static Method2 ");
		Test1 c = new Test1();
		c.instance1();	
	}

	public static void main(String[] args) {
		st();

	}

}
