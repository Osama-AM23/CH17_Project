package com.xworkz.abstractexample.internetprovider;

public class JioInternetProvider extends InternetProvider {

	public JioInternetProvider(String name, String ceo) {
		super(name, ceo);
		System.out.println("Constructor of Jio Internet Provider with Name and CEO");
	}

}
