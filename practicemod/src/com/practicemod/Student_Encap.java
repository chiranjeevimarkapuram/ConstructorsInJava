package com.practicemod;

//
//Develop a Java program to implement a Student Fee Payment System 
//using the concept of Encapsulation.
//The program should manage student details and fee information
//through appropriate methods. The system must support the following operations:
//
//Methods:
//
//setStudentDetails() – To store student ID, name, and total fee.
//
//payFee() – To accept and validate fee payments and update the paid amount.
//
//getRemainingFee() – To calculate and return the remaining fee balance.
//
//displayFeeStatus() – To display student details along with fee payment status.

//Demonstrate the working of these methods in the Driver Class

public class Student_Encap {

	private int studentId;
	private String studentName;
	private String course;

	private int total_fee;
	private int paid_fee;
	private int remain_fee;

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(int total_fee) {
		this.total_fee = total_fee;
	}

	public int getPaid_fee() {
		return paid_fee;
	}

	public void setPaid_fee(int paid_fee) {
		this.paid_fee = paid_fee;
	}

	public int getRemain_fee() {
		return total_fee - paid_fee;
	}

	public void setRemainfee(int remain_fee) {
		this.remain_fee = remain_fee;
	}

//	public void setStudent_Details(int studentId,String Student_Name,String course) {
//		
//		this.studentId=studentId;
//		this.studentName=Student_Name;
//		this.course=course;
//
//	}
//	
//	public int getStudentId() {
//		return studentId;
//	}

}
