package com.xworkz.InheritanceDataType;

public class Omkar {

	public void wash(Shoe shoe) {
		if (shoe != null) {
			shoe.safeGuard();

			System.out.println(shoe.brand);
		} else {
			System.out.println("Shoe Is Null");
		}
	}
}
