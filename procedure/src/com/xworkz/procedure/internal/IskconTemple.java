package com.xworkz.procedure.internal;

public class IskconTemple implements TempleRule {

	@Override
	public String openingTime() {
		System.out.println("Execute a opeiningTime in IskconTemple");
		return "7Am";
	}

	@Override
	public String closingTime() {
		System.out.println("Execute a closingTemple in IskconTemple");
		return "7Pm";
	}

	@Override
	public boolean KeepSilence() {
		System.out.println("Execute a KeepSilence in IskconTemple");
		return true;
	}

	@Override
	public String prayerTime() {
		System.out.println("Execute a PrayerTime in IskconTemple");
		return "8:30Am To 1:30Pm";
	}

	@Override
	public String donationPolicy() {
		System.out.println("Execute a donationPolicy in IskconTemple");
		return "Temple Maintenance";
	}

	@Override
	public String dressCode() {
		System.out.println("Execute A dress code in Iskcon Temple ");
		return "Traditonal";
	}

	@Override
	public String visitorRule() {
		System.out.println("Execute a visitor rule in Iskcon Temple");
		return "Keep silent into the Temple";
	}

	@Override
	public boolean noPhones() {
		System.out.println("Execute a noPhones in Iskcon Temple");
		return true;
	}

	@Override
	public boolean noCamera() {
		System.out.println("Execute no camera in Iskcon Temple");
		return true;
	}

	@Override
	public boolean guide() {
		System.out.println("Execute a guide in Iskcon Temple");
		return true;
	}

}
