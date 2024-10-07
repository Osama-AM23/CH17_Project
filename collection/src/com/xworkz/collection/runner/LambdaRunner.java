package com.xworkz.collection.runner;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

import com.xworkz.collection.Associate.Labour;
import com.xworkz.collection.interfaces.FoodApp;
import com.xworkz.collection.interfaces.Starter;

public class LambdaRunner {

	public static void main(String[] args) {

		Starter starter = () -> {
			System.out.println("Running a start in Lambda Runner");
		};

		Labour labour = new Labour(starter);
		System.out.println("--------------");
		labour.startWork(starter);

		System.out.println("-------------------------------------------");

		FoodApp foodApp = (String item) -> {
			System.out.println("Order food is :" + item);
		};

		labour.orderFood(foodApp);
		
		
	}
	

}
