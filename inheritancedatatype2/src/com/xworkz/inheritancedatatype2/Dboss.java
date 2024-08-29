package com.xworkz.inheritancedatatype2;

public class Dboss {
	
	private Gun gun;
	
	public Dboss(Gun gun)
	{
		this.gun=gun;
	}
	
	public void hide()
	{
		if(gun !=null)
		{
			gun.fire();
			gun.display();
		}
		else {
			System.out.println("Gun Is Null");
		}
	}
}
