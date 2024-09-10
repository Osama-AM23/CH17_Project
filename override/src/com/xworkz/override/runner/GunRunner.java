package com.xworkz.override.runner;

import com.xworkz.override.internal.Gun;

public class GunRunner {

	public static void main(String[] args) {
		
		Gun gun= new Gun("G17", "Pistol", 1.5, "India", "6", 2);
		
		Gun gun2= new Gun("G17", "pistol", 0.5, "India", "3", 1);
		
		boolean same=gun.equals(gun2);
		System.out.println("Gun and Gun2 is:"+same);
	}

}
