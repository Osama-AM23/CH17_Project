package com.xworkz.oct24Web.service;

import com.xworkz.oct24Web.DTO.RegisterDTO;

public class RegisterServiceImpl implements RegisterService {

	@Override
	public boolean checkAndSend(RegisterDTO reg) {
		
		boolean verify=true;
		
		if (reg != null) {

			String name = reg.getName();
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 15) {
				System.out.println("Valid name");
			} else {
				System.err.println("In-valid name");
				verify=false;
			}

			String email = reg.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")) {
				System.out.println("Valid Email");
			} else {
				System.err.println("In-valid Email");
				verify=false;
			}

			String age = reg.getAge();
			if (age != null) {
				System.out.println("Valid Age");
			} else {
				System.err.println("In-valid Age");
				verify=false;
			}

			String city = reg.getCity();
			if (city != null && !city.isEmpty()) {
				System.out.println("Valid City");
			} else {
				System.err.println("In-valid name");
				verify=false;
			}

			String country = reg.getCountry();
			if (country != null && !country.isEmpty()) {
				System.out.println("Valid country");
			} else {
				System.err.println("In-valid country");
				verify=false;
			}

		}
		return verify;
	}

}
