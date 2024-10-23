package com.xorkz.diffForms.service;

import com.xworkz.diffForms.DTO.ConcertDTO;

public class ConcertFormImpl implements ConcertForm {

	@Override
	public boolean validity(ConcertDTO concertDTO) {
		
		boolean check=true;
		
		if(concertDTO !=null) {
			
			int noOfTickets=concertDTO.getNoOfTickets();
			
			if(noOfTickets >=2 && noOfTickets <=10) {
				System.out.println("No of Tickets is valid");
			}else {
				System.err.println("No of Tickets is in-valid");
				check=false;
			}
		}
		return check;
	}

}
