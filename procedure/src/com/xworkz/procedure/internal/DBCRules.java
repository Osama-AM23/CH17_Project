package com.xworkz.procedure.internal;

public class DBCRules implements CollegeRule {

	@Override
	public boolean idCard() {
		System.out.println("Execute a idCard in DBCRules");
		return true;
	}

	@Override
	public boolean inShirt() {
		System.out.println("Execute a inShirt in DBCRules");
		return true;
	}

	@Override
	public boolean shoes() {
		System.out.println("Execute a shoes in DBCRules");
		return true;
	}

	@Override
	public String setClgTiming() {
		System.out.println("Execute a setClgTiming in DBCRules");
		return null;
	}

	@Override
	public String time() {
		System.out.println("Executed a time in DBCRules");
		return "8Am to 2Pm";
	}

	@Override
	public boolean antiRagging() {
		System.out.println("Executed a antiRagging in DBCRules");
		return true;
	}

	@Override
	public boolean smoking() {
		System.out.println("Executed a smoking in DBCRules");
		return false;
	}

	@Override
	public String setDressCode() {
		System.out.println("Execute a setDressCode in DBCRules");
		return "Formal & Semi-Formal Only";
	}

	@Override
	public boolean books() {
		System.out.println("Execute a books in DBCRules");
		return true;
	}

	@Override
	public int setLibHours() {
		System.out.println("Execute a setLibHours in DBCRules");
		return 1;
	}
}
