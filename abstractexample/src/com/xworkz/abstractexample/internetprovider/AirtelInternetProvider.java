package com.xworkz.abstractexample.internetprovider;

public class AirtelInternetProvider extends InternetProvider {
	
	public AirtelInternetProvider(String name, String ceo) {
		super(name, ceo);
		System.out.println("Constructor of Airtel Internet Provider");
	}

}
