package com.xworkz.partialAbstraction.internal;

public class AdidasFootWear implements FootWear {
	//Over Riding a Protect method
	@Override
	public void protect() {
		System.out.println("Execute a protect in adidas FootWear");
		
	}
	// over riding a style method
	@Override
	public void style() {
		System.out.println("Execute a style in adidas FootWear");
		
	}
	
	

}
