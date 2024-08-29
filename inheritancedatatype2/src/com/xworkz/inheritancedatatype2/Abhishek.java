package com.xworkz.inheritancedatatype2;

public class Abhishek {
	
	private WashingMachine washingmachine;
	
	public Abhishek(WashingMachine washingmachine)
	{
		this.washingmachine=washingmachine;
	}
	
	public void crush()
	{
		if(washingmachine != null) {
		washingmachine.rinse();
		washingmachine.show();
		}
		else {
			System.out.println("Washing machine is Null");
		}
	}

}
