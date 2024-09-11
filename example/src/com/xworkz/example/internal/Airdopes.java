package com.xworkz.example.internal;

//A static block is used for static initialization of a class
public class Airdopes {
	// Static variable
	static String brand;
	// Static block
	static {
		brand = "Boat";
		System.out.println("Static block executed. Static brand=" + brand);
	}

	public static void main(String[] args) {

		System.out.println("Main method execution");
		System.out.println("Static Variable :" + brand);
	}

}
