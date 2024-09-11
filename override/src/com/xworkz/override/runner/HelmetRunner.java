package com.xworkz.override.runner;

import com.xworkz.override.internal.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {
		
		Helmet helmet= new Helmet("Vega", 'M', "Black", 6000, 2, "ChapMoto");
		
		Helmet helmet2=new Helmet("Vega", 'S', "Grey", 6000, 2, "RevZilla");
		
		boolean same=helmet.equals(helmet2);
		System.out.println("Helmet and helmet2 is "+same);//true
	}

}
