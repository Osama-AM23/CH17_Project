package com.xworkz.using.imp;

public class MallManagement {
	
	private MallRule mallRule;// Instance Var
	
	// Constructor with parameter
	public MallManagement (MallRule mallRule)
	{
		this.mallRule= mallRule;
	}
	
	public void check()
	{
		System.out.println("Execute a Check in Mall Management");
		// Null Check
		if(mallRule != null) {
			System.out.println("mall Rule is not null");
			boolean verified=mallRule.validId();
			if(verified) {
				System.out.println("Is a Valid Id");
			}
		}else {
			System.out.println("Mall rule is Null");
		}
	}
	
	
}