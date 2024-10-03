package com.xworkz.enumExamples.enums;

public enum TicketType {
	
	ONLINE(350), OFFLINE(330);
	
	private double cost;
	
	private TicketType(double cost) {
		this.cost=cost;
	}
	
	public double getCost() {
		return cost;
	}
}
