package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.example.BankAccount;

public class BankAccountRunner {

	public static void main(String[] args) {
		
		BankAccount bank= new BankAccount();
		System.out.println("Account Holder: "+bank.getAccountHolderName());
		System.out.println("Account No : "+bank.getAccountNo());

	}
}
