package com.xworkz.override.runner;

import com.xworkz.override.internal.Jeans;

public class JeansRunner {

	public static void main(String[] args) {
		
		Jeans jeans1= new Jeans("Roadster", "Slim Fit", 32, "Black", 550, "SAVADIKAFASHION");
		
		Jeans jeans2= new Jeans("HIGHLANDER ","Baggy Fit", 32,"Grey", 760,"HSAtlastradeFashion");
		
		boolean same=jeans1.equals(jeans2);
		System.out.println("Jeans1 and Jeans2 is :"+same);//false
		
	}

}
