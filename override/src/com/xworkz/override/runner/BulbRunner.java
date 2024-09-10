package com.xworkz.override.runner;

import com.xworkz.override.internal.Bulb;

public class BulbRunner {

	public static void main(String[] args) {
		
		Bulb bulb= new Bulb("Philips", 18, "White", "Led", 189,"SuperComNet");
		
		Bulb bulb2= new Bulb("Philips", 20, "White", "Lcd", 189,"SuperCom");
		
		boolean same=bulb.equals(bulb2);
		System.out.println("Bulb And Bulb2 is:"+same);
	}

}
