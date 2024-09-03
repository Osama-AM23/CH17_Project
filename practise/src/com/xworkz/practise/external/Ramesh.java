package com.xworkz.practise.external;

import com.xworkz.practise.internal.Gun;
import com.xworkz.practise.internal.Weapon;

public class Ramesh extends Weapon {
	
	public void user() {
		Weapon weapon1= new Weapon();
		weapon1.fire();
	    use();
	}
	
	public void person()
	{
		Gun gun= new Gun();
		gun.fire();
		gun.hold();
		
	}
}
