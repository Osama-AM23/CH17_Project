package com.xworkz.inheritancedatatype2;

public class Sabrin {
	
	public void off(Laptop laptop)
	{
		if(laptop !=null)
		{
			laptop.operate();
			laptop.display();
		}
		else {
			System.out.println("Laptop is null");
		}
	}
}
