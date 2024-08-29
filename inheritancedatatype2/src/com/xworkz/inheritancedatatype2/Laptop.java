package com.xworkz.inheritancedatatype2;

public class Laptop {
	
	private String Brand;
	private String model;
	private double price;
	
	public Laptop() {
		System.out.println("Creating a Laptop with No agrs");	
		}

	public Laptop(String brand, String model, double price) {
		super();
		this.Brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void operate()
	{
		System.out.println("Running a operate in Laptop");
	}
	
	public void display()
	{
		System.out.println("Running a display in Laptop");
		System.out.println(this.Brand);
		System.out.println(this.model);
		System.out.println(this.price);
	}
	
	
}
