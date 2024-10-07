package com.xworkz.collection.Associate;

import java.util.function.Consumer;

import com.xworkz.collection.interfaces.FoodApp;
import com.xworkz.collection.interfaces.Starter;

public class Labour {
	
	
	
	public Labour() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructs a Labour object and attempts to start the provided Starter.
	 *
	 * @param starter An instance of Starter that can be used to initiate some process.
	 *                If the starter is not null, it will call the start() method.
	 *                If the starter is null, a message indicating this will be logged.
	 */
	public Labour(Starter starter) {
		System.out.println("Creating a labour const");
		
		if(starter != null) {
			System.out.println("starter is not null");
			starter.start();
		}
		else {
			System.out.println("starter is Null");
		}
	}
	
	public void startWork(Starter starter) {
		
		System.out.println("Execute a start motor in Labour");
		
		if(starter !=null) {
			System.out.println("Starter is not null");
			starter.start();
		}
		else {
			System.out.println("Starter is Null");
		}
	}
	
	public void orderFood(FoodApp foodApp) {
		System.out.println("Execute a orderFood in labour");
		
		if(foodApp !=null) {
			System.out.println("FoodApp is not null");
			foodApp.order("Briyani");
		}
		else {
			System.out.println("Food App is null");
		}
	}

	
}
