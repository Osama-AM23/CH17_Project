package com.xorkz.diffForms.service;

import com.xworkz.diffForms.DTO.MovieDTO;

public class MovieFormImpl implements MovieTicketForm{

	@Override
	public boolean verify(MovieDTO movieDTO) {
		
		boolean verified=true;
		
		if(movieDTO != null) {
			
			String name=movieDTO.getName();
			if(name != null && !name.isEmpty() && name.length()>4) {
				System.out.println("Name is valid");
			}else {
				System.err.println("Name is in-valid");
				verified=false;
			}
			
			int movieTicket= movieDTO.getTotalTickets();
			if(movieTicket >=1) {
				System.out.println("Movie Tickets is valid");
			}else {
				System.err.println("Movie Ticket is in-valid");
				verified=false;
			}
			
			
		}
		return verified;
	}

}
