package com.xworkz.procedure.internal;

public class SBIBankRule implements BankRule{

	
	@Override
	public boolean manager() {
		System.out.println("Executive manager in SBI bank");
		return true;
	}
	
	@Override
	public boolean amount() {
		System.out.println("Execute an amount in SBI bank");
		return true;
	}
	
	@Override
	public boolean account() {
		System.out.println("Execute account in SBI bank");
		return true;
	}
	
	@Override
	public boolean keepSilent() {
		System.out.println("Execute a keep silent in SBI bank");
		return true;
	}
	
	@Override
	public boolean locker() {
		System.out.println("Execute a locker in SBI bank");
		return true;
	}
	
	@Override
	public boolean security() {
		System.out.println("Execute a security in SBI bank");
		return true;
	}
	
	@Override
	public int minBalance() {
		System.out.println("Execute a miniBalance in SBI bank");
		return 1000;
	}
	
	@Override
	public double transactionFee() {
		System.out.println("Execute a transaction fee in SBI bank");
		return 10;
	}
	
	@Override
	public boolean withdrawl() {
		System.out.println("Execute a withdrawal in SBI bank");
		return true;
	}
	
	@Override
	public boolean deposit() {
		System.out.println("Execute a deposit in SBI bank");
		return true;
	}
	
	@Override
	public boolean keepClean() {
		System.out.println("Execute a keep clean in SBI bank");
		return true;
	}
	
	@Override
	public boolean longTermLoan() {
		System.out.println("Execute long term loan in SBI bank");
		return true;
	}
	
	@Override
	public boolean getDebitCard() {
		System.out.println("Execute a get debit card in SBI bank");
		return true;
	}
	
	@Override
	public boolean getCreditCard() {
		System.out.println("Execute a get credit card in SBI bank");
		return true;
	}
	
	@Override
	public boolean onlineBanking() {
		System.out.println("Execute an online banking in SBI bank");
		return true;
	}
}
