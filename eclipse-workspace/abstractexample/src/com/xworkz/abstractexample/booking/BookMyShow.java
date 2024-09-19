package com.xworkz.abstractexample.booking;

public class BookMyShow extends MovieBookingProvider {

	public int totalHalls;

	public BookMyShow(String name, String ceo, int totalHalls) {
		super(name, ceo);
		this.totalHalls = totalHalls;
		System.out.println("Constructor of Book My Show with name, Ceo and TotalHalls");
	}

}
