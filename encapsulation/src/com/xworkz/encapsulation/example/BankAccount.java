package com.xworkz.encapsulation.example;

public class BankAccount {

	// Private attributes to hold account information
	private String accountHolderName = "Osama";

	private String accountNo = "26190021378";
	
	 // Public method to get the account holder's name
	public String getAccountHolderName() {

		return this.accountHolderName; // Returns the current account holder's name
	}
	
	// Package-private method to set the account holder's name
	void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;// Allows updating the account holder's name
	}
	
	// Public method to get the account number
	public String getAccountNo() {

		return this.accountNo; // Returns the current account Number
	}
	
	// Package-private method to set the account number
	void setAccountNo(String accountNo) {
		this.accountNo = accountNo;// Allows upadating the account Number
	}

}
