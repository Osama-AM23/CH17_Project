package com.xorkz.diffForms.service;

import com.xworkz.diffForms.DTO.FeedBackDTO;

public class FeedBackFormImpl implements FeedBackForm {

	@Override
	public boolean validateAndSumbit(FeedBackDTO feedback) {
		
		boolean check=true;
		
		if(feedback != null) {
			
			String name=feedback.getName();
			if(name != null && !name.isEmpty() && name.length() >=3 && name.length()<=20) {
				System.out.println("Name is valid");
			}else {
				System.err.println("Name is in-valid");
				check= false;
			}
			
			String email= feedback.getEmail();
			if(email !=null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")) {
				System.out.println("Email is valid");
			}else {
				System.err.println("Email is in-valid");
				check= false;
			}
			
			String comments= feedback.getComments();
			if(comments != null && comments.length() >=10) {
				System.out.println("Comments is valid");
			}else {
				System.err.println("Comments is in-valid");
				check= false;
			}
			
			
		}
		
		return check;
	}

}
