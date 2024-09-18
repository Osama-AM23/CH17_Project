package com.xworkz.using.imp;

public class CanaraHotelRule implements HotelRule {
	
	@Override
	public boolean cleanPremises() {
		System.out.println("Running a Clean Premises in Canara Hotel Rule");
		return true;
	}


}
