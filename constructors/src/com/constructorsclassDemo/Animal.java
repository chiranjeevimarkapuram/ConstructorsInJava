package com.constructorsclassDemo;

class Animal {

	String name = "Tiger";

	Animal() {
		System.out.println("No-agrs constructor from Animal Class");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started from Animal Class");

	}
}

class Dog extends Animal {
	String name = "Loin";
	int age = 21;

	Dog() {
		// super(); //in java takens super() automatically .
		// When it called In above Animal Class also same No-agrs constructor s there it
		// called automatically with super() keyword when we couldnot write
		System.out.println("No-agrs constructor called..!");
	}

	void show() {
		System.out.println(super.name);
	}

//In static method we could not calling this and super 
	public static void main(String[] args) {
		// we can run multiple main methods in multiple class but at a
		// time we can run only one class .
		System.out.println("Main Method started from Dog Class");
		Dog d = new Dog();
		// d.show();

		System.out.println(d.name);
		System.out.println(d.age);

	}
}
