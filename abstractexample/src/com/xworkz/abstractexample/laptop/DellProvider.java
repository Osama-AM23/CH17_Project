package com.xworkz.abstractexample.laptop;

import com.xworkz.abstractexample.internetprovider.Provider;

public class DellProvider extends Provider {
	
	public DellProvider(String name, String ceo) {
		super(name, ceo);
		System.out.println("Constructor of Dell Provider with Name and Ceo");
	}
	
	@Override
	public void service() {
		System.out.println("Running a Service in Dell Provider");
		
	}

}
