package com.xworkz.main;

import com.xworkz.partialAbstraction.internal.AdidasFootWear;
import com.xworkz.partialAbstraction.internal.FootWear;
import com.xworkz.partialAbstraction.internal.PumaFootWear;

public class FootWearRunner {
	
	public static void main(String[] args) {
		
		FootWear footwear= new AdidasFootWear();
		footwear.protect(); // Calling protect() from adidas FootWear
		footwear.style(); // Calling style() from adidas FootWear
		System.out.println("-----------");
		FootWear footWear= new PumaFootWear();
		footWear.protect(); // Calling protect() from Puma FootWear
		footWear.style(); // Calling style() from puma FootWear
	}

}
