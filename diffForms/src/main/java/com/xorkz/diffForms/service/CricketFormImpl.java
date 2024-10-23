package com.xorkz.diffForms.service;

import com.xworkz.diffForms.DTO.CricketDTO;

public class CricketFormImpl implements CricketForm{

	@Override
	public boolean isApply(CricketDTO cricketDTO) {
		
		boolean apply=true;
		
		if(cricketDTO != null) {
			
			String name=cricketDTO.getCustomerName();
			if(name !=null && !name.isEmpty() && name.length()>4) {
				System.out.println("Name is Valid");
			}else {
				System.err.println("Name is in-valid");
				apply=false;
			}
			
			String email= cricketDTO.getCustomerEmail();
			if(email !=null && !email.isEmpty() && email.contains("@") && (email.endsWith(".com") || email.endsWith(".in"))) {
				System.out.println("Email is Valid");
			}else {
				System.err.println("Email is in-valid");
				apply=false;
			}			
			int noOfTickets= cricketDTO.getNoOfTickets();
			if(noOfTickets >1) {
				System.out.println("Tickets is valid");
			}else {
				System.err.println("Tickets is in-valid");
				apply=false;
			}
			
			String seatType= cricketDTO.getSeatType();
			if(seatType !=null) {
				System.out.println("Seat Type is valid");
			}else {
				System.err.println("Seat Type is in-valid");
				apply=false;
			}
			
			
			
		}
		return apply;
	}

}
