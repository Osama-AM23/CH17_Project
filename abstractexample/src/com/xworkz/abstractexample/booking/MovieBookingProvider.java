package com.xworkz.abstractexample.booking;

public class MovieBookingProvider extends BookingProvider {

	public MovieBookingProvider(String name, String ceo) {
		super(name, ceo);
		System.out.println("Constructor of Movie Booking Provider with name and Ceo");
	}
	
	public void book() {
		System.out.println("Book method in Movie Booking Provider");
	}
	
	public void cancel() {
		System.out.println("Cancel method in Movie Booking Provider");
	}

}
