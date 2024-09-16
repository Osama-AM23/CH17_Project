package com.xworkz.procedure.internal;

public class NimansHospital implements HospitalRule {

	@Override
	public int noOfVisiters() {
		System.out.println("Execute a noOfVisiters in NimansHospital");
		return 1;
	}

	@Override
	public String getAdmissionPolicy() {
		System.out.println("Execute a getAdmissionPolicy in NimansHospital");
		return "Patients must present a valid ID and insurance";
	}

	@Override
	public boolean beSilent() {
		System.out.println("Execute a beSilent in NimansHospital");
		return true;
	}
}
