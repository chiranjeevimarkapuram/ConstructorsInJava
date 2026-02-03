package com.constructorsclassDemo;

//Constructor Chaining 
//we can write multiples classes in one class not a problem
class vechile {
	String name = "FZ-S";

}

class Bike extends vechile {
	String name = "RE";//Variable Overriding
	void show() {
		System.out.println(super.name);
		System.out.println(this.name);
	}
}


public class ConstructorChaining {
	
	
	public static void main(String[] args) {
		System.out.println("Main Method Started..!!");
		Bike b1 = new Bike();
		// b1.name();//Its raises error becoz we couldn't extends the bike from the
		// Vechile or
		// We Couldn't create the variable(name) in the bike class.
		b1.show();
		System.out.println("Main Method Ended");
	}

}
