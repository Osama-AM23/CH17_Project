package com.xworkz.using.imp;

public class FoodSafetyDepartment {
	private HotelRule hotelRule;

	public void setHotelRule(HotelRule hotelRule) {
		this.hotelRule = hotelRule;
	}

	public void inspection() {
		if (hotelRule != null) {
			System.out.println("hotelRule is not Null");
			hotelRule.cleanPremises();
		}
		else {
			System.out.println("hotelRule is null");
		}
	}

}
