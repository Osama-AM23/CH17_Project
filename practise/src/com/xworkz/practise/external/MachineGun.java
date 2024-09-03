package com.xworkz.practise.external;

import com.xworkz.practise.internal.Weapon;

public class MachineGun extends Weapon {
	
	@Override
	protected void use() {
		System.out.println("Running a use in MachineGun");
	}

	@Override
	public void fire() {
		System.out.println("Running a fire in MachineGun");
	}
	
	public void access()
	{
		use();
		fire();
		
	}
}
