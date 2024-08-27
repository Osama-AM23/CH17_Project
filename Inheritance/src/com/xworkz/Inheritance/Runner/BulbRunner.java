package com.xworkz.Inheritance.Runner;

import com.xworkz.Inheritance.Bulb;
import com.xworkz.Inheritance.TubeLight;

public class BulbRunner {

	public static void main(String[] args) {
		
		 TubeLight tubelight1 = new TubeLight();
	     tubelight1.brand = "Philips";
	     System.out.println("Brand :"+tubelight1.brand);
	     tubelight1.company();
	     System.out.println("--------------");
	     
	     Bulb bulb1= new TubeLight();
	     bulb1.brand="LG";
	     System.out.println("Brand :"+bulb1.brand);
	     bulb1.company();
		
		
	}

}
