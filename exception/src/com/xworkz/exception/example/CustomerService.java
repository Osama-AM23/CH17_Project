package com.xworkz.exception.example;

public class CustomerService {

	public void saveEmail(String eMail) throws InvalidEmail {
		System.out.println("Save Email in Customer Service");

		if (eMail == null && eMail.contains("@") && eMail.endsWith(".com")) {
			System.out.println("In valid E mail, Will not execute");
			throw new InvalidEmail();
		}
		System.out.println("Valid Email Address");
	}

	public void acceptPrice(double price) {
		System.out.println("Accept Price in Customer Service");
		
		if(price >0 && price >100) {
			System.out.println("Not Accept price, will not execute");
			
			throw new InvalidPrice();
		}
		else {
			System.out.println("Price Accepted, will be execute");
		}
	}
}
