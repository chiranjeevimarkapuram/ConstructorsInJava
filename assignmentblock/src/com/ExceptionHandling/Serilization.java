package com.ExceptionHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3303137727470479913L;
	int id=111;
	String uname="chiru";
	transient int password =12345;
}


public class Serilization {

	public static void main(String[] args) throws IOException {
		System.out.println("Main Method Started ");
		
		Student s1 = new Student();

		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\chira\\OneDrive\\Desktop\\HTML VCube\\serilization.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		
		oos.close();
		fos.close();
		

		System.out.println("Main Method Ended..");
	}

}
