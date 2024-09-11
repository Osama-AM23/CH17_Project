package com.xworkz.example.runner;

import com.xworkz.example.internal.CabDriver;

public class CabDriverRunner {

	public static void main(String[] args) {
		
		CabDriver cab= new CabDriver();
		System.out.println("-------");
		CabDriver cab2= new CabDriver("Kalai");
		System.out.println("-------");
		CabDriver cab3= new CabDriver("Prem", 29, 25000);

	}

}
