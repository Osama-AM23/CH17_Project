package com.xworkz.override.runner;

import com.xworkz.override.internal.Saree;

public class SareeRunner {

	public static void main(String[] args) {
		
		Saree saree1= new Saree("MIRCHI ","Silk" , 999, "White", "5%","Sourbh");
		
		Saree saree2= new Saree("MIRCHI", "Silk", 999, "Yellow","5%", "Moltira");
		
		boolean equal=saree1.equals(saree2);
		System.out.println("Saree1 and Saree2 is :"+equal);
	}

}
