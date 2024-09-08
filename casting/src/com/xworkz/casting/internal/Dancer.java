package com.xworkz.casting.internal;

public class Dancer {

	public void use(Belt belt) {
		System.out.println("Running a Use in Dancer");
		belt.tie();

		if (belt instanceof LeatherBelt) {
			// casting
			System.out.println("instance of LeatherBelt");
			LeatherBelt leatherbelt = (LeatherBelt) belt;
			leatherbelt.clip();
		}
	}
}
