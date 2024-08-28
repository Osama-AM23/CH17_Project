package com.xworkz.InheritanceDataType;

public class Devu {
	
	public WaterBottle waterbottle;
	
	public void use()
	{
		if(waterbottle !=null)
		{
			waterbottle.crush();
			waterbottle.fill();
			waterbottle.empty();
			System.out.println(waterbottle.quantity);
			System.out.println(waterbottle.color);
		}
		else {
			System.out.println("Water Bottle is Null");
		}
	}
}
