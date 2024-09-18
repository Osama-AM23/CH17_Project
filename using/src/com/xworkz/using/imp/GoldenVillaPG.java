package com.xworkz.using.imp;

public class GoldenVillaPG implements PGRule{
	
	@Override
	public double costPerMonth() {
		System.out.println("Execute a cost per month in Golden Villa");
		return 6000;
	}

	@Override
	public boolean wifi() {
		System.out.println("Execute a wifi in Golden Villa");
		return true;
	}
}
