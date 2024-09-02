package com.xworkz.chaining;

public class Geyser {

	private String brand;
	private int capacity;
	private double price;


	public Geyser(String brand, int capacity) {
		super();
		this.brand = brand;
		this.capacity = capacity;
	}


	public Geyser(String brand, int capacity, double price) {
		//chaining 
		this(brand, capacity);
		this.price = price;
	}
	
	public void display() {
		System.out.println("Running a display in Geyser");
		System.out.println(brand);
		System.out.println(capacity);
		System.out.println(price);
	}
	
	

}
