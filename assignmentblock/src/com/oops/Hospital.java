package com.oops;

public class Hospital {

	private int patientId;
	private String name;
	private int daysAdmited;
	private int dailyCharges; //
	private int medicineCharges;

	
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDaysAdmited() {
		return daysAdmited;
	}

	public void setDaysAdmited(int daysAdmited) {
		this.daysAdmited = daysAdmited;
	}

	public int getDailyCharges() {
		return dailyCharges;
	}

	public void setDailyCharges(int dailyCharges) {
		this.dailyCharges = dailyCharges;
	}

	public int getMedicineCharges() {
		return medicineCharges;
	}

	public void setMedicineCharges(int medicineCharges) {
		this.medicineCharges = medicineCharges;
	}

	int dis = (medicineCharges + dailyCharges) * daysAdmited;;

	double calculate(double dis) {
		if (daysAdmited < 5) {
			return dis;
		} else if (daysAdmited > 5) {
			return dis * 0.05;
		} else if (daysAdmited < 10) {
			return dis * 0.10;
		}
		return dis;
	}

	void displayBill() {
		System.out.println("patientId : " + patientId);
		System.out.println("Name:" + name);
		System.out.println("Total Bill:" + dis);

	}
}
