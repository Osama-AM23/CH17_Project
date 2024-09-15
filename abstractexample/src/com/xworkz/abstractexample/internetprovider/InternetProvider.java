package com.xworkz.abstractexample.internetprovider;

public class InternetProvider extends Provider{
	
	public InternetProvider(String name, String ceo) {
		super(name, ceo);
		System.out.println("Constructor of Internet Provider");
	}
	@Override
	public void service() {
		System.out.println("Running a Service in Internet Provider");
	}

}
