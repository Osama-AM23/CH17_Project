package com.xworkz.InheritanceDataType;

public class Salim {

	public Towel towel;

	public void fold() {
		if (towel != null) {
			towel.use();
			towel.wash();
			towel.dry();
			System.out.println(towel.material);
		} else {
			System.out.println("Towel is Null");
		}
	}
}
