package com.ch17.runner;

import com.ch17.task.Bike;

public class BikeRunner {

	public static void main(String[] args) {
		
		Bike bike1=new Bike();
		bike1.store("Royal Enfield");
		bike1.store("Pulsar NS 200");
		bike1.store("R15 V4");
		bike1.store("Ninja");
		bike1.store("Ola");
		bike1.store("BMW X3");
		bike1.store("MT 15");
		bike1.display();
	}

}
