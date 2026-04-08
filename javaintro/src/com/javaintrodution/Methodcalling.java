package com.javaintrodution;

public class Methodcalling {
	
	
	void display() {
		System.out.println("Instance Method calling ");
	}
	
	
	
	static void fun() {
		System.out.println("Static Method calling");
		Methodcalling o = new Methodcalling();//object creation
		o.display();
	}
	

	public static void main(String[] args) {
		
		
		Methodcalling o = new Methodcalling();
		
		o.display();//instance Method calling
		fun();//static Method calling

	}

}
