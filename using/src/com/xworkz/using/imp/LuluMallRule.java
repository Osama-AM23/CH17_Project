package com.xworkz.using.imp;

public class LuluMallRule implements MallRule {
	
	@Override
	public boolean validId() {
		System.out.println("Execute a valid Id in Lulu Mall Rule");
		return true;
	}

}
