package com.xworkz.inheritancedatatype2;

public class Prem {
	
	private Laptop laptop;
	
	public Prem(Laptop laptop) {
		this.laptop=laptop;
	}
	
	public void damage()
	{
		if(laptop !=null) {
			laptop.display();
		}
		else {
			System.out.println("Laptop is Null");
		}
	}
}
