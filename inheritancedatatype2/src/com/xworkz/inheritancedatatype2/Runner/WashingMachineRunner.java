package com.xworkz.inheritancedatatype2.Runner;

import com.xworkz.inheritancedatatype2.Abhishek;
import com.xworkz.inheritancedatatype2.Bhumika;
import com.xworkz.inheritancedatatype2.Lakshmi;
import com.xworkz.inheritancedatatype2.Megha;
import com.xworkz.inheritancedatatype2.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
		Megha megha =new Megha();
		megha.wash();
		System.out.println("---------");
		
		Lakshmi lakshmi= new Lakshmi();
		WashingMachine washingmachine= new WashingMachine("Orient", "Top Model", 5);
		lakshmi.dry(washingmachine);
		System.out.println("---------");

		WashingMachine washingmachine1= new WashingMachine("Whirlpool", "Top Model", 8);

		Abhishek abhishek= new Abhishek(washingmachine1);
		abhishek.crush();
		System.out.println("---------");

		
		Bhumika bhumika = new Bhumika(); 
		bhumika.repare();
		
	}

}
