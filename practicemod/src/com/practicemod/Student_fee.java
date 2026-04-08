package com.practicemod;

public class Student_fee {

	public static void main(String[] args) {

		System.out.println("Main Method Started ..!");

		Student_Encap s1 = new Student_Encap();
//
		s1.setStudentId(19);
		System.out.println("student_id:" + s1.getStudentId());

		s1.setStudentName("chiru");
		System.out.println("student_name :" + s1.getStudentName());

		s1.setCourse("JFS");
		System.out.println("corse_name :" + s1.getCourse());

		s1.setTotal_fee(99999);
		System.out.println("total_fee:" + s1.getTotal_fee());

		s1.setPaid_fee(10000);
		System.out.println("paid fee:" + s1.getPaid_fee());

		System.out.println("remaining_fee:" + s1.getRemain_fee());

//		s1.setStudent_Details(19,"chiru","JFS");
//		System.out.println(s1.getStudentId());

	}

}
