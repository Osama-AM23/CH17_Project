package com.xworkz.example.runner;

import com.xworkz.example.internal.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		
		WaterBottle waterbottle= new WaterBottle();
		waterbottle.store(1);// calling from int version
		waterbottle.store("Water");// calling from String version
		
	}

}
