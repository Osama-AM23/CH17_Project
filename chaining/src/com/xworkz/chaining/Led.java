package com.xworkz.chaining;

public class Led extends Light{
	
	public void broke()
	{		
		System.out.println("Running a Broke in Led ");
		on();
	}
	
	//over riding 
	@Override
	public void on() {
		System.out.println("Running a on in Led");
		super.off();
	}
	
}
