package com.xworkz.practise.internal;

public class Gun extends Weapon {
	@Override
	protected void use() {
		System.out.println("Running a use in Gun");
	}

	@Override
	public void fire() {
		System.out.println("Running a fire in Gun");
	}

	public void hold() {
		System.out.println("Running a hold in Gun");
		use();
		fire();
	}
}
