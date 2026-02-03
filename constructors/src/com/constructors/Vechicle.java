package com.constructors;

class vechicles {
	String Bike_Name = "FS-5";
}

class bikes extends vechicles {
	String Bike_Name = "RE";

	void show() {
		System.out.println(super.Bike_Name);
		System.out.println(this.Bike_Name);
	}

}
//this() and super() only for constructor calling 
public class Vechicle {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		vechicles v1 = new vechicles();
		bikes b1 = new bikes();
		b1.show();
		// ((bikes) v1).show();
		// vechicles cannot be cast to class com.constructors.bikes
		// (com.constructors.vechicles and com.constructors.bikes
		// are in unnamed module of loader 'app')
		// at com.constructors.Vechicle.main(Vechicle.java:23)
		System.out.println("Main Method Ended");

	}

}
