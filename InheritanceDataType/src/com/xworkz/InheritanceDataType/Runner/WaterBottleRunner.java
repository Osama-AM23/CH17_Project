package com.xworkz.InheritanceDataType.Runner;

import com.xworkz.InheritanceDataType.Devu;
import com.xworkz.InheritanceDataType.Gunashree;
import com.xworkz.InheritanceDataType.Shwetha;
import com.xworkz.InheritanceDataType.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		
		Gunashree gunashree=new Gunashree();
		gunashree.wash();
		System.out.println("--------------");
		
		WaterBottle waterbottle=new WaterBottle();
		
		Shwetha shwetha=new Shwetha();
		shwetha.store(waterbottle);
		System.out.println("--------------");

		Devu devu=new Devu();
		devu.waterbottle=new WaterBottle();
		devu.use();
		
				
	
	}

}
