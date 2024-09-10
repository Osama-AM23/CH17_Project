package com.xworkz.override.internal;

public class Grinder {
	// instance variables
	private String brand;
	private double price;
	private String modelNo;
	private int warranty;
	private String color;
	private int noOfJars;

	// Constructor with parameters
	public Grinder(String brand, double price, String modelNo, int warranty, String color, int noOfJars) {
		super();
		this.brand = brand;
		this.price = price;
		this.modelNo = modelNo;
		this.warranty = warranty;
		this.color = color;
		this.noOfJars = noOfJars;
	}

	// over-ride the toString method
	@Override
	public String toString() {
		return "Grinder [brand=" + brand + ", price=" + price + ", modelNo=" + modelNo + ", warranty=" + warranty
				+ ", color=" + color + ", noOfJars=" + noOfJars + "]";
	}

	// over-ride the equals method
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running a equals in Grinder");
		if(obj!=null) {
			if(obj instanceof Grinder) {
				Grinder casted=(Grinder)obj;
				if(this.brand.equals(casted.brand) && this.price== casted.price) {
					System.out.println("Lhs and Rhs is Equal");
				}
			}else {
				System.out.println("Obj is not a Grinder");
			}
		}else {
			System.out.println("Obj is Null");
		}
		return true;
	}

}
