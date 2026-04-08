package com.oops;

public class HomeLoan {

	void Homeloan() {
		LoanApproveDetails ld = new LoanApproveDetails();
		ld.PersonDetails();
		ld.Status();
		ld.adharCard();
		ld.Mobile();
		ld.pancard();
		if (!ld.salary()) {
			System.out.println("Application Declined..!");
			return;
		}
		if (!ld.cibilScore()) {
			System.out.println("Appilcation Declined..!");
			return;
		}
		ld.Address();
		ld.reverify();
//		ld.ApprovedOrRejected();
	}
}
