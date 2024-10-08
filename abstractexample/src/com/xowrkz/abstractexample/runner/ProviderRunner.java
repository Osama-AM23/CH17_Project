package com.xowrkz.abstractexample.runner;

import com.xworkz.abstractexample.booking.BookMyShow;
import com.xworkz.abstractexample.booking.BookingProvider;
import com.xworkz.abstractexample.booking.MovieBookingProvider;
import com.xworkz.abstractexample.internetprovider.AirtelInternetProvider;
import com.xworkz.abstractexample.internetprovider.ExtremeAirtelInternetProvider;
import com.xworkz.abstractexample.internetprovider.Fast5gExtreme;
import com.xworkz.abstractexample.internetprovider.InternetProvider;
import com.xworkz.abstractexample.internetprovider.JioInternetProvider;
import com.xworkz.abstractexample.internetprovider.SatelliteJioIntProvider;
import com.xworkz.abstractexample.laptop.DellProvider;
import com.xworkz.abstractexample.laptop.LenovoProvider;

public class ProviderRunner {

	public static void main(String[] args) {

		InternetProvider internet1 = new InternetProvider("ACT fibernet", "Bala Malladi");
		InternetProvider internet2 = new InternetProvider("ACT fibernet", "Bala Malladi");
		// Displaying object details and checking equality
		System.out.println(internet1.toString());
		boolean same = internet2.equals(internet1);
		System.out.println("Internet1 and Internet2 :" + same);
		internet1.service();

		System.out.println("---------------");

		AirtelInternetProvider airtelInternet1 = new AirtelInternetProvider("Amdocs", "Shuky Sheffer");
		AirtelInternetProvider airtelInternet2 = new AirtelInternetProvider("Ericsson", "Borje Ekholm");
		// Displaying object details and checking equality
		System.out.println(airtelInternet1.toString());// calling toString method
		boolean equal = airtelInternet1.equals(airtelInternet2);// calling equals method
		System.out.println("airtelInternet1 and airtelInternet2 :" + equal);
		airtelInternet1.service();// calling service() method

		System.out.println("---------------");

		ExtremeAirtelInternetProvider extremeAirtel1 = new ExtremeAirtelInternetProvider("ultra-speed internet",
				"Christopher Coleman");
		ExtremeAirtelInternetProvider extremeAirtel2 = new ExtremeAirtelInternetProvider("Airtel Xstream Fiber",
				"Soumen Ray");
		// Displaying object details and checking equality
		System.out.println(extremeAirtel1.toString());
		boolean areEqual = extremeAirtel2.equals(extremeAirtel1);
		System.out.println("Extreme Airtel1 and Extreme Airtel2 :" + areEqual);
		extremeAirtel1.service();

		System.out.println("---------------");

		Fast5gExtreme fivegExtreme = new Fast5gExtreme("Airtel Xstream router", "Gopal Vittal");
		Fast5gExtreme fivegExtreme2 = new Fast5gExtreme("Airtel Xstream router", "Gopal Vittal");
		// Displaying object details and checking equality
		System.out.println(fivegExtreme.toString());
		boolean areSame = fivegExtreme.equals(fivegExtreme2);
		System.out.println("5GExtreme and 5GExtreme2 :" + areSame);
		fivegExtreme.service();

		System.out.println("---------------");

		JioInternetProvider jioInternet1 = new JioInternetProvider("HSI", "Akash Ambani");
		JioInternetProvider jioInternet2 = new JioInternetProvider("HAI", "Anuj Jain ");
		// Displaying object details and checking equality
		System.out.println(jioInternet1.toString());
		boolean compare = jioInternet1.equals(jioInternet2);
		System.out.println("JioInternet1 and JioInternet2 :" + compare);
		jioInternet1.service();
		System.out.println("---------------");

		SatelliteJioIntProvider satJioInternet1 = new SatelliteJioIntProvider("Orbit Connect India", "Matt Chiasson",
				115000, "19th April 1975");
		SatelliteJioIntProvider satJioInternet2 = new SatelliteJioIntProvider("OCI-network", "Matt chan", 115000,
				"19th April 1975");
		// Displaying object details and checking equality
		System.out.println(satJioInternet1.toString());
		boolean differ = satJioInternet1.equals(satJioInternet2);
		System.out.println("satJioInternet1 and satJioInternet2 :" + differ);
		satJioInternet1.service();
		System.out.println("---------------");

		BookingProvider booking1 = new BookingProvider("Web Links", "Vills kavin");
		BookingProvider booking2 = new BookingProvider("I Ticket Dot in", "	Sh. Ajit Kumar");
		// Displaying object details and checking equality
		System.out.println(booking1.toString());
		boolean ref = booking1.equals(booking2);
		System.out.println("Booking1 and Booking2 is :" + ref);
		booking1.service();
		System.out.println("---------------");

		MovieBookingProvider movieBooking1 = new MovieBookingProvider("Bigtree Entertainment", "Ashish Hemrajani");
		MovieBookingProvider movieBooking2 = new MovieBookingProvider("Nimma Ticket", "Ashish Hemanath");
		// Displaying object details and checking equality
		System.out.println(movieBooking1.toString());
		boolean comparing = movieBooking1.equals(movieBooking2);
		System.out.println("movieBooking1 and MovieBooking2" + comparing);
		movieBooking1.service();
		movieBooking1.book();
		movieBooking1.cancel();
		System.out.println("---------------");

		BookMyShow myShow1 = new BookMyShow("BE Pvt", "Ashish Hemrajani", 8);
		BookMyShow myShow2 = new BookMyShow("I Ticket Dot in", "Ajit Kumar", 8);
		// Displaying object details and checking equality
		System.out.println(myShow1.toString());
		boolean reference = myShow1.equals(myShow2);
		System.out.println("myshow1 and myshow2 is:" + reference);
		myShow1.service();
		myShow1.book();
		myShow1.cancel();
		System.out.println("---------------");

		DellProvider dell1 = new DellProvider(" Dell Technologies", "Michael Dell");
		DellProvider dell2 = new DellProvider("Dell tech", "Michael Dell");
		// Displaying object details and checking equality
		System.out.println(dell1.toString());
		boolean eql = dell1.equals(dell2);
		System.out.println("dell1 and dell2 :" + eql);
		dell1.service();
		System.out.println("---------------");

		LenovoProvider lenovo = new LenovoProvider("IBM", "Yang Yuanqing");
		LenovoProvider lenovo2 = new LenovoProvider("Lenovo Tech", "Yang Yuanqing");
		// Displaying object details and checking equality
		System.out.println(lenovo.toString());
		boolean equalTo = lenovo.equals(lenovo2);
		System.out.println("lenovo and lenovo2 :" + equalTo);
		lenovo.service();

	}

}
