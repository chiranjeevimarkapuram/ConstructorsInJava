package com.constructorsclassDemo;

public class bike {
	double price;
	String model;
	String Brand;
	int mileage;
	int topspeed;
	void instance() {
		System.out.println("Instance method called with object b1");
	}
	
	void instance1() {
		System.out.println("Instance method called with object b3");
	}
	static void display() {
		System.out.println("static method called..!");
	}
	
	bike(){
		System.out.println("no arg constructor is called..!");	
	}

	bike(String model, String brand, double price, int mileage, int topspeed) {
		System.out.println("Parameterized constructor is called");
		this.Brand=brand;
		this.model=model;
		this.mileage=mileage;
		this.price=price;
		this.topspeed=topspeed;
	}
	
	bike(String brand){
		System.out.println("One args parameterized constructor called..!");
		this.Brand=brand;
	}
	
	 void show() {
		System.out.println("show method called");
		System.out.println("Brand:"+Brand);
		System.out.println("Model:"+model);
		System.out.println("Price:"+price);
		System.out.println("Mileage:"+mileage);
		System.out.println("Top-Speed:"+topspeed);
	}
	
	 public static void main(String[] args ) {
		System.out.println("Main Method strated..!");
		//instance();
		display();
		//default constructor 
		bike b1 =new bike();
		//b1.instance();
		
		bike b2 = new bike("BMW","BMW220",100000,20,320);
		b2.show();
		//b2.instance();//printed
	
		bike b3 =new bike("honda");
		//b3.instance1();
		b3.show();
		
	
	}

}
