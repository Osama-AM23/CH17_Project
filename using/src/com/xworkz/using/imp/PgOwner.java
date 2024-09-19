package com.xworkz.using.imp;

public class PgOwner {

	private PGRule pgRule;// Instance variable

	// Constructor with Parameter
	public PgOwner(PGRule pgRule) {
		this.pgRule = pgRule;
	}

	public void check() {
		System.out.println("Execute a check in Pg Owner");
		// Null Check
		if (pgRule != null) {
			System.out.println("Pg rule is  Not Null");
			// calling methods form Pg Rule
			pgRule.costPerMonth();
			boolean available = pgRule.wifi();
			if (available) {
				System.out.println("Wifi is Available in this Pg");
			}
		} else {
			System.out.println("Pg rule is null");
		}
	}

}