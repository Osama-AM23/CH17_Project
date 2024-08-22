package com.ch17.task.data;

public class SideDishData {
	private String name;
	private double price;
	private String type;
	
	public SideDishData(String name, double price, String type) 
	{
		
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public void show()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Price :"+this.price);
		System.out.println("Type :"+this.type);
	}
	
	
}
