/**
 * 
 * Create 2 Instance & static Methods and call method without object creation   
 */
package com.javaintrodution;
public class Test2 {
	
	
	void Inst1() {
		System.out.println("instance method");
	}
	
	void Inst2() {
		System.out.println("ins1 method");
		
	}
	
	static {
		Test2 r =  new Test2();
		r.Inst1();
		r.Inst2();
	}
	
	static void st1() {
		System.out.println("st1 method");
		
		
	}
	
	static void st2() {
		System.out.println("st2 method");
	}

	
	public static void main(String[] args) {
		
		System.out.println("...");
		
	
		st1();
		st2();

	}

}
