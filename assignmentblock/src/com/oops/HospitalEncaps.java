package com.oops;

import java.util.Scanner;

public class HospitalEncaps {
	

	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hosptial");
		Hospital h1 = new Hospital();

		h1.setDailyCharges(100);
		h1.setDaysAdmited(5);
		h1.setMedicineCharges(100);
		h1.getPatientId();
		h1.setName("Tej");

		System.out.println("Enter PatientId:");
		h1.setPatientId(sc.nextInt());
		System.out.println(h1.getPatientId());
		h1.calculate(1);
		h1.displayBill();

	}
}
