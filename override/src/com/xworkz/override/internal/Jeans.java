package com.xworkz.override.internal;

public class Jeans {

	// instance variables
	private String brand;
	private String type;
	private int size;
	private String color;
	private double price;
	private String seller;

	// Constructor with parameters
	public Jeans(String brand, String type, int size, String color, double price, String seller) {
		super();
		this.brand = brand;
		this.type = type;
		this.size = size;
		this.color = color;
		this.price = price;
		this.seller = seller;
	}

	// over-ride the toString method
	@Override
	public String toString() {
		return "Jeans [brand=" + brand + ", type=" + type + ", size=" + size + ", color=" + color + ", price=" + price
				+ ", seller=" + seller + "]";
	}

	// over-ride the equals method
	@Override
	public boolean equals(Object obj) 
	{
		System.out.println("Running a equals in Jeans");

		if (obj != null)
		{
			if (obj instanceof Jeans)
			{
				Jeans casted = (Jeans) obj; // casting
				
				
				         if (this.size==casted.size && this.price == casted.price)
				         {
					     System.out.println("Lhs and Rhs is Equal");
					     return true;
                         }
			             else
			             {
			             	System.out.println("Obj is not a Jeans");
	                     }
			}  
	    }
			
		else 
		{
			System.out.println("Obj is null");
		}
		
		return super.equals(obj);
	}

}
