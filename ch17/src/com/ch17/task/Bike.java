package com.ch17.task;

public class Bike {

	private String[] bikeNames=new String[7];
	private int value=0;
	
	public void store(String name)
	{
		bikeNames[value]=name;
		value++;
	}
	
	public void display()
	{
		for(String ref: bikeNames)
		{
			System.out.println("Bike Name :"+ref);
			
		}
	}
}
