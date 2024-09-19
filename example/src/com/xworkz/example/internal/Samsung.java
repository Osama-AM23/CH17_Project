package com.xworkz.example.internal;
//Super Chaining Example
public class Samsung {
	
	private String model;
	private double price;
	
	public Samsung(String model, double price)
	{
		this.model=model;
		this.price=price;
		System.out.println("Running a use in Samsung");
	}
	
	public void display() {
		System.out.println("Execute the display in samsung");
		System.out.println(this.model);
		System.out.println(this.price);
	}
}