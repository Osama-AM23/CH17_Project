package com.xworkz.example.internal;

public class WaterBottle {
	// Example of Compile-Time Polymorphism
	public void store(int capacity) {
		System.out.println("Running a Store in int WaterBottle");
		System.out.println(capacity);
	}

	// Method overloading is a classic example of compile-time polymorphism

	public void store(String name) {
		System.out.println("Running a Store in String WaterBottle");
		System.out.println(name);
	}
	
}	
