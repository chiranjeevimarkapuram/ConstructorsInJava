package com.constructors;
//Java: 

//1) Constructor Overloading
//Create a class Mobile with the following:
//Variables: brand, price, color
//Create three constructors:
//No-arg constructor → set default values.
//Constructor with brand and price
//Constructor with brand, price and color
//Print the values from each constructor by creating 3 objects in main().

public class Mobile {

	String brand;
	String color;
	double price;

	Mobile() {
		System.out.println("No-agrs c");
		this.brand="mi";
		this.color="blue";
		this.price=10000;
	}

	Mobile(String brand, double price) {
		System.out.println("two agrs");
		this.brand=brand;
		this.price=price;
		

	}

	Mobile(String brand, String color, double price) {
		System.out.println("Three agrs");
		
		this.brand=brand;
		this.color=color;
		this.price=price;

	}

	void display() {
		
		System.out.println("Mobile Details");
		System.out.println("Enter Mobile Brand:"+brand);
		System.out.println("Enter Mobile Colour:"+color);
		System.out.println("Enter Mobile Price:"+price);
	}

	public static void main(String[] args) {
		System.out.println("Main method started");

		Mobile m1 = new Mobile();
		m1.display();
		
		Mobile m2 = new Mobile("redmi",12000);
		m2.display();
		
		Mobile m3 = new Mobile("nokia","black",35000);
		m3.display();

	}

}
