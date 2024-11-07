package com.xworkz.signUpForms.Service;

import com.xworkz.signUpForms.DTO.SignUpDTO;

public class SignUpServiceImpl implements SignUpService {

	@Override
	public boolean checkAndSave(SignUpDTO dto) {
		
		boolean check= true;
		
		if(dto !=null) {
			
			int userId = dto.getUserId();
			if (userId > 2 && userId < 1000) {
			    System.out.println("Valid User ID");
			} else {
			    System.err.println("Invalid User ID");
			    check = false;
			}

			
			String email=dto.getEmail();
			if(email !=null && email.contains("@") && email.endsWith(".com")) {
				System.out.println("Valid Email");
			}else {
				System.err.println("In-Valid Email");
				check=false;
			}
			
			String password= dto.getPassword();
			if(password != null && password.length() >4 && password.length() <25) {
				System.out.println("Valid Password");
			}else {
				System.err.println("In-Valid Password");
				check=false;
			}
			
			String confirmPassword= dto.getConfirmPassword();
			if(confirmPassword != null && confirmPassword.length() >4 && confirmPassword.length() <25 && confirmPassword.equals(password)) {
				System.out.println("Valid confirm Password");
			}else {
				System.err.println("In-Valid confirm password");
				check=false;
			}
		}
		
		
		return check;
	}

}
