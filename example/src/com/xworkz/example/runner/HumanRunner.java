package com.xworkz.example.runner;

import com.xworkz.example.internal.Osama;

public class HumanRunner {

	public static void main(String[] args) {
		
		Osama osama= new Osama();
		osama.walk();
		osama.sleep();// Calling the overridden method in Osama
	}

}
