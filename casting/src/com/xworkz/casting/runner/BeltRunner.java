package com.xworkz.casting.runner;

import com.xworkz.casting.internal.Belt;
import com.xworkz.casting.internal.Dancer;
import com.xworkz.casting.internal.LeatherBelt;

public class BeltRunner {

	public static void main(String[] args) {
		Dancer dancer= new Dancer();
		Belt belt= new Belt();
		LeatherBelt leatherbelt= new LeatherBelt();
		
		
		dancer.use(belt);
		System.out.println("-------------------");
		dancer.use(leatherbelt);
		
		
		
	}

}
