package com.xworkz.override.runner;

import com.xworkz.override.internal.CreditCard;

public class CreditCardRunner {

	public static void main(String[] args) {
		
		CreditCard creditcard= new CreditCard( "Aswin", 19, 40000, "SBI", "Contact less Payment", 22);
		
		CreditCard creditCard2= new CreditCard("Aswin", 19, 40000, "HDFC", "chip", 23);
		
		boolean compare=creditcard.equals(creditCard2);
		System.out.println("Credit Card and Credit card2 is"+compare);//true
	}

}
