package com.practicemod;

import java.util.*;

//Custom Exception Class
class GradeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GradeException(String message) {
		super(message);
	}
}

//Student Class
class Student {
	String name;
	int age;
	int grade;

	// Constructor
	Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	// Method to check grade
	void checkGrade() throws GradeException {
		if (grade < 40) {
			throw new GradeException("Grade is below 40");
		} else {
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println("Grade: " + grade);
		}
	}
}

//Main Class
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking input
		String name = sc.nextLine();
		int age = sc.nextInt();
		int grade = sc.nextInt();

		// Creating student object
		Student s = new Student(name, age, grade);

		try {
			s.checkGrade();
		} catch (GradeException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}