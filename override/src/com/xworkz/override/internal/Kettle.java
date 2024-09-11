package com.xworkz.override.internal;

public class Kettle {
	//instance variables
	private String brand;
	private double capacity;
	private String material;
	private String color;
	private double price;
	private int warranty;
	// Constructor with parameters
	public Kettle(String brand, double capacity, String material, String color, double price, int warranty) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		this.material = material;
		this.color = color;
		this.price = price;
		this.warranty = warranty;
	}
	//over-ride the toString method
	@Override
	public String toString() {
		return "Kettle [brand=" + brand + ", capacity=" + capacity + ", material=" + material + ", color=" + color
				+ ", price=" + price + ", warranty=" + warranty + "]";
	}
	//over-ride the equals method
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running  Equals in Kettle");
		if (obj != null) {
			if (obj instanceof Kettle) {
				Kettle casted = (Kettle) obj; // casting
				if (this.brand.equals(casted.brand) && this.price == casted.price && this.capacity == casted.capacity ) {
					System.out.println("Lhs and Rhs is Equal");
					return true;
				}
			} else {
				System.out.println("Obj is not a Jeans");
			}
		} else {
			System.out.println("Obj is  null");
		}
		
	
		return super.equals(obj);
	}

}
