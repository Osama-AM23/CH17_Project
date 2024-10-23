package com.xorkz.diffForms.service;

import com.xworkz.diffForms.DTO.CollegeDTO;

public class CollegeFormImpl implements CollegeForm {

	@Override
	public boolean validateAndSave(CollegeDTO college) {
		
		boolean valid= true;
		if(college != null) {
		
		String name=college.getName();
		if(name !=null && !name.isEmpty() && name.length() >=3 && name.length() <=30 ) {
			System.out.println("Name is Valid");
		}else {
			System.err.println("Name is in-valid");
			valid=false;
		}
		
		String email=college.getEmail();
		
		if(email !=null && !email.isEmpty() && email.contains("@") && (email.endsWith(".com") || email.endsWith(".in"))) {
			System.out.println("Email is Valid");
		}else {
			System.err.println("Email is in-valid");
			valid=false;
		}
		
		String father= college.getFatherName();
		
		if(father != null && !father.isEmpty() && father.length() >3 && father.length() <20) {
			System.out.println("Father Name is Valid");
		}else {
			System.err.println("Father name is In-valid");
			valid=false;
		}
		
		String mother= college.getMotherName();
		
		if(mother != null && !mother.isEmpty() && mother.length() >3 && mother.length() <20) {
			System.out.println("Mother name is Valid");
		}else {
			System.err.println("Mother name is In-valid");
			valid=false;
		}
		
		int age= college.getAge();
		
		if(age >18) {
			System.out.println("Age is valid");
		}else {
			System.err.println("Age is in-valid");
		}
		
	}
	return valid;
	}
}
