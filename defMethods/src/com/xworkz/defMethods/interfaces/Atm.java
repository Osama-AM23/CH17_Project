package com.xworkz.defMethods.interfaces;

public interface Atm {
	// Abstract method
	void withdraw();
	
	//Default Method
	default void deposit() {
		System.out.println("Deposit in Atm");
	}

}
