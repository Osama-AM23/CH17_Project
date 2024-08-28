package com.xworkz.InheritanceDataType;

public class Shwetha {
	
	public void store(WaterBottle waterbottle)
	{
		if(waterbottle !=null)
		{
			waterbottle.crush();
			System.out.println(waterbottle.quantity);
		}
		else {
			System.out.println("Water Bottle is Null");
		}
	}
}
