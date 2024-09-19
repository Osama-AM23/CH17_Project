package com.xworkz.abstractexample.booking;

import com.xworkz.abstractexample.internetprovider.Provider;

public class BookingProvider extends Provider {

	public BookingProvider(String name, String ceo) {
		super(name, ceo);
	}
	
	@Override
	public void service() {
		System.out.println("Running Service in Booking Provider");
		
	}

}
