package com.xworkz.abstractexample.internetprovider;

public class SatelliteJioIntProvider extends JioInternetProvider{
	
	public double cost;
	public String launchDate;
	
	public SatelliteJioIntProvider(String name, String ceo, double cost, String launchDate) {
		super(name, ceo);
		this.cost=cost;
		this.launchDate=launchDate;
		System.out.println("Constructor of Satellite Jio Internet Provider with name, CEO, cost and launchDate");
	}
	

}
