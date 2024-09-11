package com.xworkz.override.runner;

import com.xworkz.override.internal.Country;

public class CountryRunner {

	public static void main(String[] args) {
		
		Country country= new Country("India", 28, 1417173173, "Narandira Modi", 1950, 91);
		
		Country country2=new Country("America", 50, 345785329, "Joe Biden", 1776, 00001);
		
		boolean compare=country.equals(country2);
		System.out.println("Country and Country2 is :"+compare);//false
	}

}
