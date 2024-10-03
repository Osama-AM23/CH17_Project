package com.xworkz.runner;

import com.xworkz.enumExamples.dto.TicketBookDTO;
import com.xworkz.enumExamples.enums.SeatType;
import com.xworkz.enumExamples.enums.TicketType;

public class TicketBookRunner {

	public static void main(String[] args) {

		TicketBookDTO ticketBook = new TicketBookDTO();
		ticketBook.setMovieName("Avengers End Game");
		ticketBook.setTheaterName("Cinepolis");
		ticketBook.setSeatType(SeatType.RECLINER);
		ticketBook.setTicketType(TicketType.ONLINE);
		
		// first probability
		System.out.println("Movie Name: " + ticketBook.getMovieName());
		System.out.println("Theater Name: " + ticketBook.getTheaterName());
		System.out.println("Ticket Type: " + ticketBook.getTicketType());
		System.out.println("Ticket Cost:" + ticketBook.getTicketType().getCost());
		System.out.println("Seat Type: " + ticketBook.getSeatType());
		System.out.println("Seat Number: " + ticketBook.getSeatType().getSeatNo());
		
		//second probability
		// double seat=ticketBook.getTicketType().getCost();
		// System.out.println(seat);
	}

}
