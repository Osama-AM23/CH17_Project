package com.xworkz.override.runner;

import com.xworkz.override.internal.Bedsheet;

public class BedsheetRunner {

	public static void main(String[] args) {
		
		 Bedsheet bedsheet= new Bedsheet("Cotton", "Pink", 180, 'S', 2, 550);
		 
		 Bedsheet bedsheet2= new Bedsheet("Cotton", "White", 150, 'M', 2, 550);
		 
		 boolean comapre=bedsheet.equals(bedsheet2);
		 System.out.println("Bed sheet and bed sheet2 is"+comapre);
		 
		 
	}

}
