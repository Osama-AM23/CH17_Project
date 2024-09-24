package com.xworkz.defMethods.runner;

import com.xworkz.defMethods.interfaces.Atm;
import com.xworkz.defMethods.interfacesImplement.AtmImplement;

public class AtmRunner {

	public static void main(String[] args) {
		
		Atm atm = new AtmImplement();
		atm.withdraw();
		atm.deposit();

	}

}
