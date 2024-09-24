package com.xworkz.defMethods.interfacesImplement;

import com.xworkz.defMethods.interfaces.Atm;

public class AtmImplement implements Atm {

	// over-Ride abstract method
	@Override
	public void withdraw() {
		System.out.println("Withdraw in Atm Implement");

	}

	// Optional: Over ride the default method
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		Atm.super.deposit();
	}
}
