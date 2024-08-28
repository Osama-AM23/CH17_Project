package com.xworkz.InheritanceDataType;

public class Harshitha {
	
	public Shoe shoe;
	
	public void dry() {
		System.out.println("Running a dry in Harshitha");
		if(shoe != null)
		{
			shoe.enhanceWalk();
			shoe.safeGuard();
			System.out.println(shoe.cost);
			System.out.println(shoe.brand);
		}
		else {
			System.out.println("Shoe is Null");
		}
	}
}
