package com.POJO;

public class Student {
	private int sno;
	private String name;
	private int marks;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String toString() {
		return name + " :" + marks;
	}
	public Student() {
	}

	Student(int s, String name, int marks) {
		this.sno = s;
		this.name = name;
		this.marks = marks;
	}

	
}
