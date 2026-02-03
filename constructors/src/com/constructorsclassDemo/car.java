package com.constructorsclassDemo;

public class car {
	String model;
	String brand;
	double Price;
	String color;
	//no-arg constructor
	car(){
		System.out.println("no-agrs constuctor called ..!");
	}
	//one arg parameterized constructor
	car(String model){
		System.out.println("*******One agr parameterized  constructor called..!");
		this.model=model;
	}
	//two arg parameterized constructor 
	car(String brand,String color){
		System.out.println("Two args parameterized constructor called.!");
		this.brand=brand;
		this.color=color;
		
	}
	
	//Three agrs parameterized constructor is called
	car(String model,String brand,String color){
		System.out.println("Three-agrs constructor called..!");
		this.color=color;
		this.brand=brand;
		this.model=model;
	}
	//four args constructor called
	car(String model,double price,String brand,String color){
		System.out.println("***Four agrs constructor called ..!***");
		this.color=color;
		this.brand=brand;
		this.Price=price;
		this.model=model;
		
	}
	void display() {
		System.out.println("Model of the car:"+model);
		System.out.println("Brand of the car:"+brand);
		System.out.println("Price of the car:"+Price);
		System.out.println("Colour of the car:"+color);
	}
	public static void main(String[] args) {
		System.out.println("Main method strated ");
		car c1 = new car();//Default constructor or object creation
		c1.display();
		
		car c2 = new car("curve");//one arg constructor called with these object creation or constructor created
		c2.model="kia";//here "curve" is not printed why becoz after curve-->kia is loaded to the jvm
		c2.display();

		//two args constructor called
		car c3 = new car("TATA","Black");
		c3.display();
		
		//three agrs constructor called 
		car c4 = new car("Thar","Mahi","Black");
		c4.display();
		
		//four agrs constructor called
		car c5 = new car("nexon",1000000,"honda","Red");
		//these argument order is only printed the final output
		c5.display();
	}

}
