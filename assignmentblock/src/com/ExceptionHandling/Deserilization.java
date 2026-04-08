package com.ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		System.out.println("Main Method Started");
		FileInputStream fis = new FileInputStream("C:\\Users\\chira\\OneDrive\\Desktop\\HTML VCube\\serilization.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Student s = (Student) ois.readObject();
		System.out.println(s.id);
		System.out.println(s.uname);
		System.out.println(s.password);
		
		ois.close();
		fis.close();

		System.out.println("Main Method Ended..");

	}

}
