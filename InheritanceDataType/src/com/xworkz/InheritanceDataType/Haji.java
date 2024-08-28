package com.xworkz.InheritanceDataType;

public class Haji {

	public void using(Towel towel) {
		if (towel != null) {
			towel.use();
			System.out.println(towel.price);
		} else {
			System.out.println("Towel Is Null");
		}
	}
}
