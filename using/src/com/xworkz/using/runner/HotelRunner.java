package com.xworkz.using.runner;

import com.xworkz.using.imp.CanaraHotelRule;
import com.xworkz.using.imp.FoodSafetyDepartment;
import com.xworkz.using.imp.HotelRule;

public class HotelRunner {

	public static void main(String[] args) {
		
		HotelRule hotelRule= new CanaraHotelRule();
		
		
		FoodSafetyDepartment foodSafety= new FoodSafetyDepartment();
		foodSafety.setHotelRule(hotelRule);
		foodSafety.inspection();
		
	
	}

}
