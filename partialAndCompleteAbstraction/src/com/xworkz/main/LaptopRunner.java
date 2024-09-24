package com.xworkz.main;

import com.xworkz.partialAbstraction.internal.DellLaptop;
import com.xworkz.partialAbstraction.internal.HpLaptop;
import com.xworkz.partialAbstraction.internal.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		
		Laptop laptop= new HpLaptop();
		laptop.playGames();
		laptop.study();
		System.out.println("---------------");
		Laptop laptop2= new DellLaptop();
		laptop2.playGames();
		laptop2.study();
		

	}

}
